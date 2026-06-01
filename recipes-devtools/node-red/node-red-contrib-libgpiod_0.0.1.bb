DESCRIPTION = "Node-RED Contrib LibGPIOd"
HOMEPAGE = "https://flows.nodered.org/node/node-red-contrib-libgpiod"
LICENSE = "MIT"

require node-red-module.inc

LIC_FILES_CHKSUM = "file://LICENSE;md5=52ea20dd37f68b2df4d424c43ead5758"

DEPENDS += "node-libgpiod"
RDEPENDS:${PN} += "node-libgpiod"
