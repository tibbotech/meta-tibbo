DESCRIPTION = "Node FS Extra"
HOMEPAGE = "https://www.npmjs.com/package/fs-extra"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "MIT"
SECTION = "nodejs/module"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=fs-extra;version=${PV}"
SRC_URI += "npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

LIC_FILES_CHKSUM = "file://LICENSE;md5=fc102d2590522804e7ae98ffd97af410"
