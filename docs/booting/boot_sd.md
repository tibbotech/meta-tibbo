Booting from SD card directly
-----------------------------

1. After the Yocto build go to <builddir>/images/tppg2/ directory and find 
<myimagename>.wic
files there.

2. Write your WIC file to SD card.
- for Linux:
```
dd if=./myimage.wic of=/dev/sd<X> bs=1M
```
- for Windows please use any of 
[the following tools](https://www.makeuseof.com/tag/10-tools-make-bootable-usb-iso-file/)

3. Insert your SD card back to the PC, open its first (FAT) partition
(say, /run/media/`whoami`/boot) and

a) cut the ISP file from <builddir>/images/tppg2sdboo/ to 64K and save it to the 1'st partition of the SD under ISPBOOOT.BIN name:
```
dd if=<builddir>/images/tppg2/sdboo/img-...ISP of=/run/media/`whoami`/boot/ISPBOOOT.BIN count=64 bs=1K
```
OR

b) download [this file](https://archives.tibbo.com/downloads/LTPS/FW/LTPPg2/ISPBOOOT.BIN-SD) and save it to the 1'st partition of the SD under ISPBOOOT.BIN name:
```
wget -O /run/media/`whoami`/boot/ISPBOOOT.BIN https://archives.tibbo.com/downloads/LTPS/FW/LTPPg2/ISPBOOOT.BIN-SD
```

4. Sync and unmount (In windows Eject) the SD card from your PC.

5. Insert SD card to LTPP3G2 device, short CN10 and CN11 jumpers.

6. Reset the board

