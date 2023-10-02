
do_install:append() {
 p="/usr/lib/python3.11/site-packages/orjson/"
 f=`find ${D}${p} -name "*cpython-*.so" -print -quit`
 f0=`basename ${f}`
 ln -s ${p}/${f0} ${D}${p}/orjson.so
}

INSANE_SKIP:${PN} += "dev-so"
