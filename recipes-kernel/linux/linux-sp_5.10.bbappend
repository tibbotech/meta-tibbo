FILESEXTRAPATHS:prepend := "${THISDIR}/linux-sp-5.10:"

# additional DTSes
SRC_URI += "file://dts/sp7021-ltpp3g2revF.dts.patch"
SRC_URI += "file://dts/sp7021-ttt.dts.patch"
SRC_URI += "file://dts/sp7021-ltpp3g2-empty.dts.patch"
SRC_URI += "file://dts/sp7021-dsx.dts.patch"
SRC_URI += "file://dts/sp7021-dsx.dtsi.patch"
# tppg2 no BT (uart4) by default
SRC_URI += "file://dts/sp7021-ltpp3g2revD.dts.wifionly.patch"

# for gpio-driven rts/cts
#SRC_URI += "file://uart_gpio_rtscts/sp_uart.c.dbg.patch"
#SRC_URI += "file://uart_gpio_rtscts/sp7021-tpstest.dts.4ctsrts.patch"
#SRC_URI += "file://uart_gpio_rtscts/sp7021-tpsgpio.dts.4ugpio.patch"
# FIXME
#SRC_URI += "file://485/sp_uart.c.0.patch"
#SRC_URI += "file://485/serial_core.c.dbg0.patch"

#SRC_URI += "file://dbg_spi/spi.c.dbg0.patch"

# set GPIO to 83 for ltpp3g2
#SRC_URI += "file://bcmdhd-gpio/dhd_gpio.c.gpio.patch"
#SRC_URI += "file://bcmdhd-gpio/dhd_gpio.c.of.patch"

# Goodix dbg
#SRC_URI += "file://goodix-dbg/goodix.c.dbg.patch"

KERNEL_FEATURES:append = " features/wireguard/wireguard.scc"

KERNEL_FEATURES:append = " cfg/rpi-ovls/ovls-4.19.scc"

CANFD_BRANCH = "6.x.backport"
CANFD_REV = "6c8f0de4c81f7988eed8e2af373e1dc893c6811a"
