DESCRIPTION = "LibMatroska MKV library from Matroska.Org"
HOMEPAGE = "https://github.com/Matroska-Org/libmatroska"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "GPL-2.0-or-later"
SECTION = "libs"

inherit autotools pkgconfig

S = "${WORKDIR}/git"

SRC_URI  = "git://github.com/Matroska-Org/libmatroska.git;protocol=https;branch=master;tag=release-${PV}"

DEPENDS += "libebml"

LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=801f80980d171dd6425610833a22dbe6"
