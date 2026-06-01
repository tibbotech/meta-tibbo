DESCRIPTION = "Node-RED Contrib ModBus Node"
HOMEPAGE = "https://flows.nodered.org/node/node-red-contrib-modbus"
LICENSE = "BSD-3-Clause"

require node-red-module.inc

do_install:prepend() {
 find ${NPM_BUILD} -name "@serialport" -type d -exec rm -rf {} +
 find ${NPM_BUILD} -name "modbus-serial" -type d -exec rm -rf {} +
}

LIC_FILES_CHKSUM = "file://LICENSE;md5=a8a138d0a4ac5c1ac429ddf4ee0c2ecb"

DEPENDS += "node-modbus-serial"
DEPENDS += "node-serialport"

RDEPENDS:${PN} += "node-fs-extra"
RDEPENDS:${PN} += "node-modbus-serial"
RDEPENDS:${PN} += "node-serialport"
