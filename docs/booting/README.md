Booting/flashing HowTo for sp7021
---------------------------------

Debugging the initramfs flow
```
seteenv args_kern shell-debug
run bootcmd
```

To get into shell in case of fatal:
```
setenv args_kern init_fatal_sh=true
run bootcmd
```

[Flashing internal EMMC](flash_emmc.md) from USB or SD card.

[Booting from SD](boot_sd.md) directly.

