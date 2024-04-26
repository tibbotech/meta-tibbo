IMAGE_INSTALL += "${@bb.utils.contains("DISTRO_FEATURES", "tpm2", "packagegroup-tpm2", "", d)}"
IMAGE_INSTALL += "${@bb.utils.contains("DISTRO_FEATURES", "ima", "packagegroup-ima", "", d)}"
IMAGE_INSTALL += "${@bb.utils.contains("DISTRO_FEATURES", "luks", "packagegroup-luks", "", d)}"
IMAGE_INSTALL += "${@bb.utils.contains("DISTRO_FEATURES", "ids", "packagegroup-ids", "", d)}"

IMAGE_INSTALL += "rsync"
