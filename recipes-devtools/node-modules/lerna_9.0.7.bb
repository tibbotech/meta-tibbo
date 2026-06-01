DESCRIPTION = "NodeJs Project Management Tool"
HOMEPAGE = "https://github.com/lerna/lerna"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "MIT"
SECTION = "nodejs/module"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=${BPN};version=${PV}"
#SRC_URI += "npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

LIC_FILES_CHKSUM = "file://LICENSE;md5=38c0a1bbd032f1ce5dda1a988213690f"
