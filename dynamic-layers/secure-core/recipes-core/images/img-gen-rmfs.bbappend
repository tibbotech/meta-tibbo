ROOTFS_BOOTSTRAP_INSTALL:append = " ${@bb.utils.contains("DISTRO_FEATURES", "tpm2", "packagegroup-tpm2-initramfs", "", d)}"
ROOTFS_BOOTSTRAP_INSTALL:append = " ${@bb.utils.contains("DISTRO_FEATURES", "luks", "packagegroup-luks-initramfs", "", d)}"
ROOTFS_BOOTSTRAP_INSTALL:append = " ${@bb.utils.contains("DISTRO_FEATURES", "ima",  "packagegroup-ima-initramfs", "", d)}"

# have exclude iniramfs-framework from OE to use it
# PACKAGE_INSTALL += "initrdscripts-secure-core"

PACKAGE_INSTALL += "initramfs-module-luks"
