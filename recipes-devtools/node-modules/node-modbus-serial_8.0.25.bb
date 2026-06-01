DESCRIPTION = "Node Modbus Serial"
HOMEPAGE = "https://www.npmjs.com/package/serialport"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "ISC"
SECTION = "nodejs/module"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=modbus-serial;version=${PV}"
#SRC_URI += "npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

LIC_FILES_CHKSUM = "file://LICENSE;md5=98a791f4f18cf4e29c99e206ad1b55f3"

INSANE_SKIP:${PN} += "already-stripped"
