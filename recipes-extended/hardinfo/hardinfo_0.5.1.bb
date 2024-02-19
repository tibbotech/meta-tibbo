DESCRIPTION = "System profiler and benchmark for Linux systems"
HOMEPAGE = "https://github.com/lpereira/hardinfo"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "GPL-2.0-only"
SECTION = "console/utils"

SRCREV="2e97dad917a3dda37f1c4b4c49d206affb169deb"

inherit autotools-brokensep

S = "${WORKDIR}/git/hardinfo2"

SRC_URI  = "git://github.com/lpereira/hardinfo.git;protocol=https;branch=master"

DEPENDS += "gtk+"
DEPENDS += "pango"

LIC_FILES_CHKSUM = "file://LICENSE;md5=79808397c3355f163c012616125c9e26"
