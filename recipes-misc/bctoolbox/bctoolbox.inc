DESCRIPTION = "SIP stack from Belledonne Communications"
LICENSE = "GPL-2.0-only"
SECTION = "libs/network"

INC_PR = "r0"

#DEPENDS = "libpolarssl-bc cunit-bc"
PROVIDES = "bctoolbox"
S = "${WORKDIR}/git"

INSANE_SKIP:${PN} += "dev-deps "

#inherit distutils-base cmake pkgconfig
inherit cmake pkgconfig

EXTRA_OECMAKE += "-DENABLE_TESTS_COMPONENT=OFF -DCMAKE_SKIP_INSTALL_RPATH=ON"

#EXTRA_OECMAKE += " -DENABLE_STATIC=NO -DENABLE_TESTS=NO -DENABLE_TESTS_COMPONENT=ON -DCMAKE_SKIP_INSTALL_RPATH=ON "
#EXTRA_OECMAKE += "-DCMAKE_INSTALL_DATAROOTDIR=share -DCMAKE_INSTALL_LIBDIR=lib"

do_autoreconf () {
    ./autogen.sh
}
