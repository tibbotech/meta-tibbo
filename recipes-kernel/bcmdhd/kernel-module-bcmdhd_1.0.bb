DESCRIPTION = "AP6926 WiFi/BT"
HOMEPAGE = "http://tibbo.com/"
MAINTAINER = "Dvorkin Dmitry <dvorkin@tibbo.com>"
SECTION = "kernel/modules"
PRIORITY = "optional"
LICENSE = "GPLv2"
PR = "r1"
SRCREV="${AUTOREV}"

PACKAGES =+ "${PN}-includes"
PACKAGE_ARCH:${PN}-includes = "all"

S = "${WORKDIR}/bcmdhd"

inherit module

#SRC_URI = "file://bcmdhd.tar.gz"
## set GPIO to 83 for ltpp3g2
#SRC_URI += "file://dhd_gpio.c.gpio.patch"
#SRC_URI += "file://dhd_gpio.c.of.patch"
#SRC_URI += "file://Makefile.out.patch"

SRC_URI = "file://bcmdhd.5.10.tar.gz"
# set GPIO to 83 for ltpp3g2
SRC_URI += "file://dhd_gpio.c.gpio.5.10.patch"
SRC_URI += "file://dhd_gpio.c.of.5.10.patch"
SRC_URI += "file://Makefile.out.5.10.patch"
SRC_URI += "file://Makefile.fw.5.10.patch"

EXTRA_OEMAKE += "CONFIG_BCMDHD=m CONFIG_BCMDHD_SDIO=y CONFIG_BCMDHD_SDIO_IRQ=y"
EXTRA_OEMAKE += "CONFIG_BCMDHD_FW_PATH=\\\"/lib/firmware/brcm/fw_bcm43456c5_ag.bin\\\""
EXTRA_OEMAKE += "CONFIG_BCMDHD_NVRAM_PATH=\\\"/lib/firmware/brcm/nvram_ap6256.txt\\\""

EXTRA_OEMAKE += "bcmdhd_sdio"
export LINUXDIR="${KERNEL_SRC}"

RDEPENDS:${PN} += "bcmdhd-firmware"

LIC_FILES_CHKSUM = "file://${FILESDIR_tibbo}/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"
