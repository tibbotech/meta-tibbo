DESCRIPTION = "Node Pre Gyp"
HOMEPAGE = "https://www.npmjs.com/package/node-pre-gyp"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "BSD-3-Clause"
SECTION = "console/utils"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=@mapbox/${BPN};version=${PV}"
#SRC_URI += "npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

LIC_FILES_CHKSUM = "file://LICENSE;md5=7e13c3cf883a44ebcc74a8f568c0f6fb"
