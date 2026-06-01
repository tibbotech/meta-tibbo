DESCRIPTION = "Node nvd3"
HOMEPAGE = "https://www.npmjs.com/package/nvd3"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "Apache-2.0"
SECTION = "nodejs/module"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=nvd3;version=${PV}"
SRC_URI += "npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

LIC_FILES_CHKSUM = "file://LICENSE.md;md5=fc0986679e5dcc48e6d74b1076de5906"
