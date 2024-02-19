DESCRIPTION = "Node Tibbo UartMode"
HOMEPAGE = "https://tibbo.com/"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "GPL-2.0-only"
SECTION = "nodejs/module"
SRCREV="${AUTOREV}"

inherit npm

NPMPN = "${PN}"

SRC_URI = "git://github.com/tibbotech/ltps-node-uart-mode.git;protocol=https;branch=master"

S = "${WORKDIR}/${PN}"

LIC_FILES_CHKSUM = "file://LICENSE;md5=0835ade698e0bcf8506ecda2f7b4f302"

