
FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://luks"

do_install:append() {
 install -m 0755 ${WORKDIR}/luks ${D}/init.d/80-luks
}

PACKAGES += "initramfs-module-luks"

SUMMARY:initramfs-module-luks = "initramfs support for LUKS"
RDEPENDS:initramfs-module-luks = "${PN}-base"
FILES:initramfs-module-luks = "/init.d/80-luks"
