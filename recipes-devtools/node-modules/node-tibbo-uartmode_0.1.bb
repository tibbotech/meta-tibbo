DESCRIPTION = "Node Tibbo UartMode"
HOMEPAGE = "https://tibbo.com/"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "GPL-2.0-only"
SECTION = "nodejs/module"
SRCREV = "83882ca95d3d1391f90da47cc0ca242a060d0bb1"

inherit npm

NPMPN = "${PN}"

SRC_URI = "git://github.com/tibbotech/ltps-node-uart-mode.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
