DESCRIPTION = "EBML library for binary XML from Matroska.Org"
HOMEPAGE = "https://github.com/Matroska-Org/libebml"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "LGPL-2.0-or-later"
SECTION = "libs"

inherit autotools

S = "${WORKDIR}/git"

SRC_URI  = "git://github.com/Matroska-Org/libebml.git;protocol=https;branch=master;tag=release-${PV}"

LIC_FILES_CHKSUM = "file://LICENSE.LGPL;md5=801f80980d171dd6425610833a22dbe6"
