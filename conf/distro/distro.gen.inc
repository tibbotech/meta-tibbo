
DISTRO_NAME = "Tibbo Project System (${MACHINE})"
DISTRO_VERSION = "2.0-1"
#DISTRO_VERSION:append = "-${DATE}"
DISTRO_CODENAME = "${LAYERSERIES_CORENAMES}"
SDK_VERSION = "${@d.getVar('DISTRO_VERSION').replace('snapshot-${DATE}', 'snapshot')}"
#SDK_VERSION = "${@d.getVar('DISTRO_VERSION')}"

MAINTAINER = "Dvorkin Dmitry <dvorkin@tibbo.com>"

TARGET_VENDOR = "-tps"

LOCALCONF_VERSION = "2"

DISTRO_VERSION[vardepsexclude] = "DATE"
SDK_VERSION[vardepsexclude] = "DATE"

TIBBO_DEFAULT_EXTRA_RDEPENDS = "packagegroup-core-boot"
TIBBO_DEFAULT_EXTRA_RRECOMMENDS = "kernel-module-af-packet"

DISTRO_FEATURES = ""

SDK_NAME = "${DISTRO}-${TCLIBC}-${SDKMACHINE}-${IMAGE_BASENAME}-${TUNE_PKGARCH}-${MACHINE}"
SDKPATH = "/opt/${DISTRO}/${SDK_VERSION}"

DISTRO_EXTRA_RDEPENDS += " ${TIBBO_DEFAULT_EXTRA_RDEPENDS}"
DISTRO_EXTRA_RRECOMMENDS += " ${TIBBO_DEFAULT_EXTRA_RRECOMMENDS}"

TCLIBCAPPEND = ""

PREMIRRORS ??= "\
bzr://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n \
cvs://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n \
git://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n \
gitsm://.*/.* http://downloads.yoctoproject.org/mirror/sources/ \n \
hg://.*/.*    http://downloads.yoctoproject.org/mirror/sources/ \n \
osc://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n \
p4://.*/.*    http://downloads.yoctoproject.org/mirror/sources/ \n \
svn://.*/.*   http://downloads.yoctoproject.org/mirror/sources/ \n"

# QA check settings - a little stricter than the OE-Core defaults
WARN_TO_ERROR_QA = "already-stripped compile-host-path install-host-path \
                    installed-vs-shipped ldflags pn-overrides rpaths staticdev \
                    unknown-configure-option useless-rpaths"
WARN_QA:remove = "${WARN_TO_ERROR_QA}"
ERROR_QA:append = " ${WARN_TO_ERROR_QA}"

require conf/distro/include/no-static-libs.inc
require conf/distro/include/yocto-uninative.inc
require conf/distro/include/security_flags.inc
INHERIT += "uninative"

BB_SIGNATURE_HANDLER ?= "OEEquivHash"
BB_HASHSERVE ??= "auto"

# DV: additional options

# generate locales, but do not install (see IMAGE_LINGUAS in img)
#GLIBC_GENERATE_LOCALES = "en_US.UTF-8 zh_CN.UTF-8 ru_RU.UTF-8 zh_TW.UTF-8 es_ES.UTF-8 en_GB.UTF-8"
LOCALE_UTF8_IS_DEFAULT:class-nativesdk = "1"

DISTRO_FEATURES:append = " directfb"
#DISTRO_FEATURES:append = " alsa pulseaudio bluez5"
#DISTRO_FEATURES:append = " cramfs"
# OpenAMP
#DISTRO_FEATURES:append = " openamp"

#PACKAGE_FEED_URIS += "http://192.168.75.150/"
PACKAGE_FEED_URIS += "http://tibbo.com/downloads/LTPS/repo/${MACHINE}"
#PACKAGE_FEED_ARCHS = "all cortexa8hf_neon tpp"

#INHERIT += "sign_package_feed"
#PACKAGE_FEED_GPG_NAME = "Tibbo GPG name"
#PACKAGE_FEED_GPG_PASSPHRASE_FILE = "file://${COREBASE}/x"

# there may also be PREFFERED_VERSION_xxx = .. placed

INHERIT:remove = "create-spdx"
# SPDX_PRETTY="1"
