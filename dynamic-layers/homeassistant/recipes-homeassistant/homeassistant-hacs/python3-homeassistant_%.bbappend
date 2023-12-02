
SRC_URI += "https://github.com/hacs/integration/releases/latest/download/hacs.zip;name=hacs;subdir=hacs;"

FILES:${PN}-hacs = "${HOMEASSISTANT_CONFIG_DIR}/custom_components/hacs"

do_install:append() {
 install -d ${D}${HOMEASSISTANT_CONFIG_DIR}/custom_components/hacs
 cp -R --no-dereference --preserve=mode,links -v ${WORKDIR}/hacs/* ${D}${HOMEASSISTANT_CONFIG_DIR}/custom_components/hacs
}

SRC_URI[hacs.sha256sum] = "0e5dc4d17c39cf3c76dbf276edff445461fcde2e02fe561613032b13269bad16"
