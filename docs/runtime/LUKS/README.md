# LUKS (Linux Unified Key Setup)

## LUKS for rootfs

### The idea

LUKS is the set of tools to encrypt/mount the partitions. The encryption of the
partition means reformatting the partition. Rootfs should be backed up, reformated
to LUKS and restored somehow. So we should boot from another partition or from 
another source (SD card boot for example).

LUKS uses the chained keys for encryption. The first key may be stored in TPM,
in the file or entered as the password (at the boot/mount time).

LUKS should be setup at the runtime.

The simplest way to run LTPP3G2 rootfs on LUKS is to:

1. add one more copy of the rootfs partition (#9);
2. boot from #9;
3. convert #8 into LUKS and copy the rootfs contents from #9 to #8;
4. boot from #8, delete #9 and expand #8

### Step-by-step instructions

(Assume your image already have rootfs partition #8 and the copy of rootfs #9)

1. Reset the board and stop the bootloader with any key. Run:
```
setenv emmc_root root=/dev/mmcblk0p9 rw rootwait
run bootcmd
```
Boot into Linux from the partition #9, authenticate and check if you have TPM support:
```
dmesg | grep -i TPM
```

2. Setup the LUKS for #8 partition [^1]:
```
luks-setup.sh -V -d /dev/mmcblk0p8 -n newroot -e
```
if you have TPM or
```
cryptsetup --type luks --cipher aes-xts-plain --hash sha256 --use-random luksFormat /dev/mmcblk0p8
cryptsetup luksOpen /dev/mmcblk0p8 newroot
```
if you have not [^2].

3. Format the 'newroot' partition (#8) into EXT4 and restore the data:
```
mkfs.ext4 /dev/mapper/newroot
mount /dev/mapper/newroot /mnt
rsync -axHAWXS --numeric-ids --info=progress2 / /mnt/
```

4. Reboot, delete the #9 partition and resize #8:
4.1 Reset the board
4.2 Login to the OS and run:
```
parted /dev/mmcblk0 rm 9
parted /dev/mmcblk0 resizepart 8 100%
cryptsetup resize /dev/mapper/cryptfs_tpm2
resize2fs /dev/mapper/cryptfs_tpm2
```
### Useful TPM commands
To reset the TPM (keys will be lost):
```
cd /sys/class/gpio/; echo 91 > ./export
echo 1 > ./P11_03/value && sleep 1 && echo 0 > ./P11_03/value
```

To set the access passwords:
```
tpm2_changeauth -c owner 123
tpm2_changeauth -c endorsement 456
tpm2_changeauth -c lockout 789
```

To see the list of the TPM keys:
```
tpm2_pcrread
```

To see the LUKS partition information:
```
cryptsetup luksDump /dev/mmcblk0p8
```

### Notes

[^1]: If you have TPM, but TPM is locked down or access is not possible,
you can reset the TPM and repeate the step. Note, if you'll reset the TPM, 
keys will be lost.

[^2]: Mounting the rootfs without TPM requires to enter the password on every 
boot. Alternatively you may store the password in another location 
(say file on another partition or in OTP) and force your INITRD to use it, but 
it is out of the scope of this simple manual.
