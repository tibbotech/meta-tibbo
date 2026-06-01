MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
SECTION = "nodejs/module"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=${BPN};version=${PV}"
SRC_URI += "npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

FILES:${PN} += "${libdir}/node_modules/*"

RDEPENDS:${PN} += "node-red"

