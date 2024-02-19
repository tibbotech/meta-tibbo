DESCRIPTION = "Tibbo TPS id module. Use FUSE emac to get uniq read-only TI cpsw MAC and use it as board ID"
HOMEPAGE = "https://github.com/tibbotech/kern-mod-tpsid"
MAINTAINER = "Dvorkin Dmitry <dvorkin@tibbo.com>"
AUTHOR = "Dvorkin Dmitry <dvorkin@tibbo.com>"
SECTION = "kernel/modules"
PRIORITY = "optional"
LICENSE = "GPL-2.0-only"
SRCREV="${AUTOREV}"

COMPATIBLE_MACHINE = "(tppg1|tppg2)"

PACKAGES =+ "${PN}-includes"
PACKAGE_ARCH:${PN}-includes = "all"

S = "${WORKDIR}/git"

inherit module kernel-module-split

SRC_URI = "git://github.com/tibbotech/kern-mod-tpsid.git;protocol=https;branch=main"

KERNEL_MODULE_AUTOLOAD += "tpsid"

LIC_FILES_CHKSUM = "file://${FILESDIR_tibbo}/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"
