DESCRIPTION = "Dv IRQ test module"
HOMEPAGE = "http://tibbo.com/"
MAINTAINER = "Dvorkin Dmitry <dvorkin@tibbo.com>"
AUTHOR = "Dvorkin Dmitry <dvorkin@tibbo.com>"
SECTION = "kernel/modules"
PRIORITY = "optional"
LICENSE = "GPL-2.0-only"
SRCREV="${AUTOREV}"

PACKAGES =+ "${PN}-includes"
PACKAGE_ARCH:${PN}-includes = "all"

SRC_URI = "git://github.com/tibbotech/kern-mod-dvirqtst.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit module

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
