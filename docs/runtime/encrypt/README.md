
Enable encryption:
```
# dnf install e2fsprogs-tune2fs e2fsprogs -y
# tune2fs -O encrypt /dev/mmcblk0p8
```

# Dirs and files: Ext4 native

Encrypt:
```
# e4crypt add_key
Enter passphrase (echo disabled): 
Added key with descriptor [fbbe8ff5b209dc77]

# keyctl show
Session Keyring
 729422704 --alswrv      0     0  keyring: _ses
 928667893 ----s-rv      0     0   \_ user: invocation_id
1057277181 --alsw-v      0     0   \_ logon: ext4:fbbe8ff5b209dc77

# mkdir ~/xxx
# e4crypt set_policy fbbe8ff5b209dc77 ~/xxx/
Key with descriptor [fbbe8ff5b209dc77] applied to /home/root/xxx/.

# echo "test file" > ~/xxx/ppp.txt
# cat ~/xxx/ppp.txt
test file


```

# Dirs and files: fscrypt
```
# fscrypt setup
# fscrypt status
# fscrypt setup /

```
mkdir /home/root/xxx
fscrypt encrypt /home/root/xxx

https://wiki.archlinux.org/title/Fscrypt
