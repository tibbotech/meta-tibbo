FILESEXTRAPATHS:prepend := "${THISDIR}/git:"

SRC_URI:append:class-target = " file://dnf.conf"
SRC_URI:append:class-target = " file://automatic.conf"

do_install:append:class-target() {
 install -m 0644 ${WORKDIR}/dnf.conf ${D}${sysconfdir}/dnf/dnf.conf
 install -m 0644 ${WORKDIR}/automatic.conf ${D}${sysconfdir}/dnf/automatic.conf
}
