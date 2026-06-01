require bctoolbox.inc

inherit gitpkgv

SRCREV = "1d09d7c61a4169676151573796a4335631850c05"
SRC_URI = "git://github.com/BelledonneCommunications/bctoolbox.git;protocol=https;branch=release/5.4"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ff3103b5db8ba4e2c66c511b7a73e407"

DEPENDS += "openssl"

FILES:${PN}-dev:append = " /usr/share/BCToolbox/*"
