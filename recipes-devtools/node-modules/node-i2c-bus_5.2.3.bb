DESCRIPTION = "Node I2C-bus"
HOMEPAGE = "https://www.npmjs.com/package/i2c-bus"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "MIT"
SECTION = "nodejs/module"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=i2c-bus;version=${PV}"
SRC_URI += "npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

LIC_FILES_CHKSUM = "file://LICENSE;md5=564c07e46fb0c4fe02285be2fcff614c"
