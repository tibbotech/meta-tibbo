Flashing EMMC from the SD card or USB
-------------------------------------

1. Format your SD or USB flash to FAT32 with 2048 block size
<details>
<summary>In Linux</summary>
mkfs.vfat /dev/sda
</details>

2. From the &lt;builddir&gt;/images/tppg2/emmc0/ copy the file **&lt;myimagename&gt;.ISP** to the USB or SD flash.

3. Insert SD card or USB flash into the LTPP3G2 device, short 
* **CN10 and CN11** jumpers for flashing from SD
* **CN10 only** for flashing from USB
.

4. Reset the board and wait for "DONE" message on the serial port.

5. Detouch the jumper and reset the board again to boot.
