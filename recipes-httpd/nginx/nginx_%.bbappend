
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

inherit systemd

SRC_URI += "file://all.crt"
SRC_URI += "file://all.key"
SRC_URI += "file://all.conf"

#EXTRA_OECONF += " --error-log-path=/dev/stderr"
EXTRA_OECONF += " --error-log-path=/var/log/nginx.err.log"

do_install:append() {
 install -d ${D}${sysconfdir}/nginx/ssl/
 install -m 0644 ${WORKDIR}/all.crt ${D}${sysconfdir}/nginx/ssl/
 install -m 0644 ${WORKDIR}/all.key ${D}${sysconfdir}/nginx/ssl/
 install -m 0644 ${WORKDIR}/all.conf ${D}${sysconfdir}/nginx/ssl/
}

# test for ssl forwarding
#do_install:append:tppg2() {
# install -m 0644 ${WORKDIR}/ktr_default_server ${D}${sysconfdir}/nginx/sites-available/default_server
# install -m 0644 ${WORKDIR}/ktr_default_server ${D}${sysconfdir}/nginx/sites-enabled/default_server.conf
#}

SYSTEMD_AUTO_ENABLE:${PN} = "enable"
