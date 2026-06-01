require ortp.inc

DEPENDS  = "glib-2.0 openssl"
DEPENDS += "bctoolbox"

SRCREV = "298490d88d7e531631a69fde96b4856272feb378"
SRC_URI = "git://github.com/BelledonneCommunications/ortp.git;protocol=https;branch=release/5.4"

S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=eb1e647870add0502f8f010b19de32af"

#PR = "${INC_PR}.1"

SRC_URI[sha256sum] = "eb61a833ab3ad80978d7007411240f46e9b2d1034373b9d9dfaac88c1b6ec0af"
