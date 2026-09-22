```
{{emmc_boot}}
[d] common/bootmain.c :128
dev=2
pin=1
Run draiminit@0x9E8053F9
Done draiminit
dram test 0x00800000 - 0x00800400
[d] sdmmc/drv_sd_mmc.c :21
InitChipCtrl
busclk=200000
div=1012
[d] sdmmc/drv_sd_mmc.c :23
IdentifyStorage
[d] sdmmc/hal_sd_mmc.c :507
busclk=25000000
div=8
[d] sdmmc/hal_sd_mmc.c :1729
[d] sdmmc/drv_sd_mmc.c :33
Read GPT
part1 LBA=0x00000022
emmc load uboot@blk=0x00000022
uboot1 hdr good
part2 LBA=0x00000822
emmc load uboot@blk=0x00000822
data size=467881
verify img...
uboot2 good
uboot_pentagram_board
boot next @0x00200040
put bootinfo
wake up A
A_G0.11(pll): 0x00445149
A_G0.3(abio): 0x00020718
A_G0.18(ioctrl): 0x00F1E004


U-Boot 2021.04 (Aug 03 2022 - 08:13:35 +0000)

CONFIG_SYS_CACHELINE_SIZE: 64
Model: LTPP3G2 Rev.D on SP7021 (empty sockets)
DRAM:  512 MiB
plla            :  135475200 Hz
plle            :   50000000 Hz
plle_2p5        :    2500000 Hz
plle_25         :   25000000 Hz
plle_112p5      :  112500000 Hz
pllf            :  202500000 Hz
plltv           :  148500000 Hz
plltv_a         :  148500000 Hz
pllsys          :  202500000 Hz
reset: reset@9c000054
SPI:   Manufacturer id = 0x00, Device id = 0x0000 
MMC:   emmc: 0, sd: 1
Loading Environment from MMC... OK
In:    serial
Out:   serial
Err:   serial


U-Boot 2021.04 (Aug 03 2022 - 08:13:35 +0000)

Model: LTPP3G2 Rev.D on SP7021 (empty sockets)
DRAM: 512 MiB

Reason(s) of reset: REG(116, 22): 0x0002

After cleaning  REG(116, 22): 0x0000

arch/arm/mach-pentagram/cpu.c, arch_misc_init: TBD.
Net:   eth0: l2sw@9c108000
starting USB...
Bus usb@9c102100: ehci_sunplus_probe.625, dev_name:usb@9c102100,port_num:0
after write usbruncmd,usbcmd:80b01,retry_times:0
USB EHCI 1.10
Bus usb@9c103100: ehci_sunplus_probe.625, dev_name:usb@9c103100,port_num:1
after write usbruncmd,usbcmd:80b01,retry_times:0
USB EHCI 1.10
scanning bus usb@9c102100 for devices... 2 USB Device(s) found
scanning bus usb@9c103100 for devices... 1 USB Device(s) found
       scanning usb for storage devices... 1 Storage Device(s) found
Hit any key to stop autoboot:  0 
[scr] bootcmd started
9e809408: 0000001f                               ....
[scr] emmc boot

MMC read: dev # 0, block # 6178, count 68096 ... 68096 blocks read: OK
## Loading kernel from FIT Image at 02800000 ...
   Using 'conf-1' configuration
   Trying 'kernel-1' kernel subimage
     Description:  tppg2 kernel uImage-tppg2.img
     Type:         Kernel Image
     Compression:  uncompressed
     Data Start:   0x028000c4
     Data Size:    4399336 Bytes = 4.2 MiB
     Architecture: ARM
     OS:           Linux
     Load Address: 0x00308000
     Entry Point:  0x00308040
     Hash algo:    crc32
     Hash value:   b8110215
   Verifying Hash Integrity ... crc32+ OK
## Loading fdt from FIT Image at 02800000 ...
   Using 'conf-1' configuration
   Trying 'fdt-1' fdt subimage
     Description:  tppg2 DTB sp7021-ltpp3g2revD.dtb
     Type:         Flat Device Tree
     Compression:  uncompressed
     Data Start:   0x02c737ac
     Data Size:    29741 Bytes = 29 KiB
     Architecture: ARM
     Load Address: 0x00300000
     Hash algo:    crc32
     Hash value:   794dc227
   Verifying Hash Integrity ... crc32+ OK
   Loading fdt from 0x02c737ac to 0x00300000
   Booting using the fdt blob at 0x300000
## Loading loadables from FIT Image at 02800000 ...
   Trying 'optee-1' loadables subimage
     Description:  unavailable
     Type:         Trusted Execution Environment Image
     Compression:  uncompressed
     Data Start:   0x02c32294
     Data Size:    267364 Bytes = 261.1 KiB
     Hash algo:    crc32
     Hash value:   b8404b18
   Verifying Hash Integrity ... crc32+ OK
   Loading loadables from 0x02c32294 to 0x00010000
## Loading loadables from FIT Image at 02800000 ...
   Trying 'kernel-1' loadables subimage
     Description:  tppg2 kernel uImage-tppg2.img
     Type:         Kernel Image
     Compression:  uncompressed
     Data Start:   0x028000c4
     Data Size:    4399336 Bytes = 4.2 MiB
     Architecture: ARM
     OS:           Linux
     Load Address: 0x00308000
     Entry Point:  0x00308040
     Hash algo:    crc32
     Hash value:   b8110215
   Verifying Hash Integrity ... crc32+ OK
   Loading loadables from 0x028000c4 to 0x00308000
ehci_usb_remove.635, dev_name:usb@9c102100,port_num:0
ehci_usb_remove.635, dev_name:usb@9c103100,port_num:1
   Loading Kernel Image
   Loading Device Tree to 1f8ed000, end 1f8f742c ... OK

Starting kernel ...

Uncompressing Linux... done, booting the kernel.
Booting Linux on physical CPU 0x0
Linux version 5.4.35-sp-standard (oe-user@oe-host) (gcc version 11.5.0 (GCC)) #5
CPU: ARMv7 Processor [410fc075] revision 5 (ARMv7), cr=50c5387d
CPU: div instructions available: patching division code
CPU: PIPT / VIPT nonaliasing data cache, VIPT aliasing instruction cache
OF: fdt: Machine model: SP7021 LTPP3G2 Rev. D (empty+wifi)
printk: bootconsole [earlycon0] enabled

Tibbo Project System (open-source only) Linux 5.4.35-sp-standard (armv7l)
OS Build: #1 SMP PREEMPT Fri Mar 7 06:10:04 UTC 2025
HW Date/Time: Tue Sep 22  2026 06:25:05
tppg2 login:
```
