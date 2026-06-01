DESCRIPTION = "Node opencv"
HOMEPAGE = "https://www.npmjs.com/package/@techstark/opencv-js"
MAINTAINER = "Dmitry Dvorkin <dvorkin@tibbo.com>"
LICENSE = "MIT"
SECTION = "nodejs/module"

inherit npm

SRC_URI  = "npm://registry.npmjs.org/;package=@techstark/opencv-js;version=${PV}-release.1"
#SRC_URI += "npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json"

S = "${WORKDIR}/npm"

DEPENDS += "opencv"
RDEPENDS:${PN} += "node-pre-gyp"
RDEPENDS:${PN} += "libopencv-core"
RDEPENDS:${PN} += "libopencv-face"
RDEPENDS:${PN} += "libopencv-calib3d"
RDEPENDS:${PN} += "libopencv-imgcodecs"
RDEPENDS:${PN} += "libopencv-highgui"
RDEPENDS:${PN} += "libopencv-imgproc"
RDEPENDS:${PN} += "libopencv-video"
RDEPENDS:${PN} += "libopencv-videoio"
RDEPENDS:${PN} += "libopencv-objdetect"

LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
