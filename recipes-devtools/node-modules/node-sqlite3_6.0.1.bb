DESCRIPTION = "Node SQLite3"
HOMEPAGE = "https://www.npmjs.com/package/sqlite3"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "ISC"
SECTION = "nodejs/module"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=sqlite3;version=${PV}"
SRC_URI += "npmsw://${THISDIR}/${PN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

LIC_FILES_CHKSUM = "file://LICENSE;md5=208bbe2e3c980e8c97b45b8165d582de"
