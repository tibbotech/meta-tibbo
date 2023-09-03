FILESEXTRAPATHS:prepend := "${THISDIR}/git:"

do_install:append:class-target() {
 install -m 0644 ${WORKDIR}/dnf.conf ${D}${sysconfdir}/dnf/dnf.conf
 install -m 0644 ${WORKDIR}/automatic.conf ${D}${sysconfdir}/dnf/automatic.conf
}
