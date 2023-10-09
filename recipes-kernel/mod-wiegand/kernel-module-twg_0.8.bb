DESCRIPTION = "Tibbo Wiegand module"
HOMEPAGE = "http://tibbo.com/"
MAINTAINER = "Dvorkin Dmitry <dvorkin@tibbo.com>"
AUTHOR = "Dvorkin Dmitry <dvorkin@tibbo.com>"
SECTION = "kernel/modules"
PRIORITY = "optional"
LICENSE = "GPL-2.0-only"
PR = "r1"
SRCREV="${AUTOREV}"

PACKAGES =+ "${PN}-includes"
PACKAGE_ARCH:${PN}-includes = "all"

S = "${WORKDIR}/git"

inherit module

SRC_URI = "git://github.com/tibbotech/kern-mod-twg.git;protocol=https;branch=main"

LIC_FILES_CHKSUM = "file://${FILESDIR_tibbo}/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"
