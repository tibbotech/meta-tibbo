FILESEXTRAPATHS:prepend := "${THISDIR}/u-boot:"

SRC_URI += "file://sp7021_nand_c_defconfig.sepdts.patch"
SRC_URI += "file://tpsleds.patch"

SRC_URI:append:tppg2 = " file://config/tpsleds.cfg"
SRC_URI:append:tppg2 = " file://config/gpio.cfg"
