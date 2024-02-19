DESCRIPTION = "Realtek Bluetooth over UART hci_attach programm"
HOMEPAGE = "http://carry-well.com/"
MAINTAINER = "Dvorkin Dmitry <dvorkin@tibbo.com>"
SECTION = "kernel/modules"
PRIORITY = "optional"
LICENSE = "GPL-2.0-only"
PR = "r1"

COMPATIBLE_MACHINE = "(tppg1)"

SRCREV="${AUTOREV}"

S = "${WORKDIR}/rtk_hciattach"

inherit systemd

SRC_URI  = "file://rtk_hciattach.tar.gz"
SRC_URI += "file://rtl8xxx-bt-ttyO5.rules"
SRC_URI += "file://rtk_hciattach@.service"

do_install() {
 install -d ${D}/lib/systemd/system
 install -m 0644 ${WORKDIR}/rtk_hciattach@.service ${D}/lib/systemd/system/

 install -d ${D}/usr/bin/
 install -m 0755 rtk_hciattach ${D}/usr/bin/

 install -d ${D}/etc/udev/rules.d
 install -m 0644 ${WORKDIR}/rtl8xxx-bt-ttyO5.rules ${D}/etc/udev/rules.d/rtl8xxx-bt-ttyO5.rules
}

FILES:${PN} += "/etc"
FILES:${PN} += "/lib"
FILES:${PN} += "/usr"

RDEPENDS:${PN} += "bash"
RDEPENDS:${PN} += "rtl8xxx-firmware"

LIC_FILES_CHKSUM = "file://${FILESDIR_tibbo}/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"
