SUMMARY = "DKMS Recipe - Adds DKMS tool for target"
HOMEPAGE = "https://github.com/dell/dkms/"
LICENSE = "GPL-2.0-only"

inherit autotools
#inherit autotools-brokensep

SRCREV="fa1a29b4c608b3b09128e90cb013136254095e38"

S = "${WORKDIR}/git"
B = "${WORKDIR}/git"

SRC_URI = "git://github.com/dkms-project/dkms.git;branch=main;protocol=https"

RDEPENDS:${PN} += "bash kmod gcc make patch kernel-dev"

FILES:${PN} += "/usr/share/*"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

INSANE_SKIP:${PN} += "build-deps"

LIC_FILES_CHKSUM = "file://COPYING;md5=570a9b3749dd0463a1778803b12a6dce"
