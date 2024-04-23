ROOTFS_BOOTSTRAP_INSTALL:append = " ${@bb.utils.contains("DISTRO_FEATURES", "tpm2", "packagegroup-tpm2-initramfs", "", d)}"
ROOTFS_BOOTSTRAP_INSTALL:append = " ${@bb.utils.contains("DISTRO_FEATURES", "luks", "packagegroup-luks-initramfs", "", d)}"

PACKAGE_INSTALL += "initrdscripts-secure-core"
