
FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://luks-setup.sh.detect.patch"
SRC_URI += "file://init.cryptfs.detect.patch"
