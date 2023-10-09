DESCRIPTION = "Test High Res Timers on GPIO"
HOMEPAGE = "http://tibbo.com/"
MAINTAINER = "Dvorkin Dmitry <dvorkin@tibbo.com>"
AUTHOR = "Dvorkin Dmitry  <dvorkin@tibbo.com>"
SECTION = "kernel/modules"
PRIORITY = "optional"
LICENSE = "GPL-2.0-only"
PR = "r1"

PACKAGES =+ "${PN}-includes"
PACKAGE_ARCH:${PN}-includes = "all"

# src in /files/kernel-module-timertest/*
S = "${WORKDIR}/git"

inherit module

SRC_URI  = "file://git/Makefile"
SRC_URI += "file://git/gpioHRtimer.c"

do_install() {
 install -m 0755 -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/extra
 install -m 0644 ${S}/gpioHRtimer${KERNEL_OBJECT_SUFFIX} ${D}${base_libdir}/modules/${KERNEL_VERSION}/extra/
}

LIC_FILES_CHKSUM = "file://${FILESDIR_tibbo}/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"
