DESCRIPTION = "simple GPIO and others tests"
HOMEPAGE = "http://tibbo.com/"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "GPL-3.0-or-later"
SECTION = "console/utils"
PACKAGES = "${PN}-dbg ${PN}"
SRCREV="b5a433af9805699d336d6d9d1f23254742d49bfc"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/tibbotech/ltps-dvtests.git;protocol=https;branch=master"

FILES:${PN}  = "/home/root/${PN}/*"
FILES:${PN} += "${systemd_system_unitdir}/set485@.service"
FILES:${PN}-dbg  = "/home/root/${PN}/.debug/*"

do_install() {
 oe_runmake PREFIX=${D} install
 install -d ${D}${systemd_system_unitdir}/
 install ${S}/set485@.service ${D}${systemd_system_unitdir}/
}

RDEPENDS:${PN} += "libstdc++"
RDEPENDS:${PN} += "tps-bash"

LIC_FILES_CHKSUM = "file://${FILESDIR_tibbo}/common-licenses/GPL-3.0-or-later;md5=1c76c4cc354acaac30ed4d5eefea7245"
