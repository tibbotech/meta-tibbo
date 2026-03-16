COMPATIBLE_MACHINE:append = "|tppg2"

SRC_URI:append = " file://kmeta-tppg2;type=kmeta;name=kmeta-tppg2;destsuffix=kmeta-tppg2"

# mcp251xfd mainline backport + filtering add-ons
#SRC_URI += "file://mcp251xfd-backport/mcp251xfd.tar.gz"
#SRC_URI += "file://mcp251xfd-backport/mcp251xfd.6.x.00.tar.gz"
SRC_URI += "git://github.com/tibbotech/mcp251xfd.git;protocol=https;branch=${CANFD_BRANCH};destsuffix=mcp251xfd;name=canfd"
SRC_URI += "file://mcp251xfd-backport/Kconfig.mcp251xfd.patch"
SRC_URI += "file://mcp251xfd-backport/Makefile.mcp251xfd.patch"
SRCREV_canfd = "${CANFD_REV}"
SRCREV_FORMAT:append = "_canfd"

# mcp251xfd driver
do_patch:append() {
# cp -r ${WORKDIR}/mcp251xfd ${S}/drivers/net/can/spi/
 cp -r ${WORKDIR}/mcp251xfd/mcp251xfd ${S}/drivers/net/can/spi/
}

KERNEL_DEVICETREE:append:tppg2 = " sp7021-ltpp3g2-empty.dtb"

#RDEPENDS:kernel-module-bcmdhd += "${@bb.utils.contains('DISTRO_FEATURES', 'wifi', 'bcmdhd-firmware', '', d)}"
#RRECOMMENDS:${PN} += "kernel-module-bcmdhd"

KERNEL_FEATURES:append = "${@bb.utils.contains("MACHINE_FEATURES", "touchscreen", " custom/touchscreen/all.scc", "" ,d)}"
KERNEL_FEATURES:append = "${@bb.utils.contains("MACHINE_FEATURES", "3g", " custom/modems/protos.scc", "" ,d)}"
KERNEL_FEATURES:append = " custom/tunnel/udp.scc"
KERNEL_FEATURES:append = " cgl/cfg/net/l2tp.scc"
KERNEL_FEATURES:append = " custom/netfilter/addrtype.scc"
#KERNEL_FEATURES:append = "${@bb.utils.contains("MACHINE_FEATURES", "wifi", " cfg/wifi/tppg2_brcm.scc", "" ,d)}"
KERNEL_FEATURES:append = "${@bb.utils.contains("MACHINE_FEATURES", "wifi", " cfg/wifi/tppg2_brcmI.scc", "" ,d)}"
KERNEL_FEATURES:append = " tibbits/all.scc"
KERNEL_FEATURES:append = " custom/tpm.scc"
KERNEL_FEATURES:append = " custom/dm-crypt.scc"
