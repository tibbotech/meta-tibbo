
inherit systemd

SRC_URI += "file://cams.rules"
SRC_URI += "file://cam-0.service"

do_install:append () {
 install -d ${D}/etc/udev/rules.d/
 install ${WORKDIR}/cams.rules ${D}/etc/udev/rules.d/
 install -d ${D}${systemd_system_unitdir}/
 install -m 0644 ${WORKDIR}/cam-0.service ${D}${systemd_system_unitdir}/
}

SYSTEMD_SERVICE:${PN} = "cam-0.service"
