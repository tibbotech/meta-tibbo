DESCRIPTION = "Tibbo LEDS kernel-level interface module"
HOMEPAGE = "https://github.com/tibbotech/kern-mod-tpsleds/"
MAINTAINER = "Dvorkin Dmitry <dvorkin@tibbo.com>"
AUTHOR = "Dvorkin Dmitry <dvorkin@tibbo.com>"
SECTION = "kernel/modules"
PRIORITY = "optional"
LICENSE = "GPLv2"
SRCREV="${AUTOREV}"

PACKAGES =+ "${PN}-includes"
PACKAGE_ARCH:${PN}-includes = "all"

S = "${WORKDIR}/git"

inherit module kernel-module-split

SRC_URI = "git://github.com/tibbotech/kern-mod-tpsleds.git;protocol=https;branch=main"

KERNEL_MODULE_AUTOLOAD += "tpsleds"

LIC_FILES_CHKSUM = "file://${FILESDIR_tibbo}/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"
