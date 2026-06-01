DESCRIPTION = "Node Utf-8-validate"
HOMEPAGE = "https://www.npmjs.com/package/utf-8-validate"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "MIT"
SECTION = "nodejs/module"
SRCREV = "e8f7d2ff185339f9cc6951fad446b211c7152e16"

NPMPN = "${PN}"

SRC_URI  = "git://github.com/websockets/utf-8-validate.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://LICENSE;md5=1fa91772f711ba8db872b5e09a0d3664"
