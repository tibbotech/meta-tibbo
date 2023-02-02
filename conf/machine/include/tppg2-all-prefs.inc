
# SRC_URI mirrors is defined at:
# meta-sunplus/recipes-bsp/isp/isp.bb
# meta-sunplus/recipes-bsp/b-chip/bnoos.bb
# meta-sunplus/recipes-bsp/xboot/xboot-src.inc
# meta-sunplus/recipes-bsp/u-boot/u-boot-src.inc

#PREFERRED_PROVIDER_virtual/bootloader = "u-boot-sp"
#PREFERRED_PROVIDER_u-boot = "u-boot-sp"
#PREFERRED_PROVIDER_u-boot-mkimage-native="u-boot-sp-tools-native"
#PREFERRED_PROVIDER_u-boot-mkenvimage-native="u-boot-sp-tools-native"
#PREFERRED_PROVIDER_u-boot-tools = "u-boot-sp-tools"
#PREFERRED_PROVIDER_u-boot-tools-native = "u-boot-sp-tools-native"

uboot_v = "sp"
PREFERRED_VERSION_u-boot-fw-utils = "${uboot_v}"
PREFERRED_VERSION_u-boot-tools = "${uboot_v}"
PREFERRED_VERSION_u-boot-tools-native = "${uboot_v}"
PREFERRED_VERSION_u-boot = "${uboot_v}"



# SRC_URI for "sp" is defined at:
# meta-sunplus/recipes-kernel/linux/linux-sp_%.bbappend

PREFERRED_PROVIDER_virtual/kernel = "linux-sp"
