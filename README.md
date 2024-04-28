# meta-tibbo

Yocto support layer for Tibbo SoCs.

Tibbo Technology Inc. (https://tibbo.com.com/)

## Dependances

https://git.openembedded.org/openembedded-core
    Core
    networking-layer
    multimedia-layer
    perl-layer
    meta-python
    webserver

Recommended layers:

https://github.com/tibbotech/meta-sunplus
    sunplus
https://github.com/meta-qt5/meta-qt5
    qt5-layer
https://github.com/OpenAMP/meta-openamp
    openamp-layer

Optional (TPM and LUKS support):

https://github.com/Wind-River/meta-secure-core.git
    secure-core (/meta)
    tpm2 (/meta-tpm2)
    encrypted-storage (/meta-encrypted-storage)

## Quick links

* Git repo: https://github.com/tibbotech/yocto_layers

## Description

Tibbo SoCs support images and apps

## Notes

Compatibility: Dunfell, Kirstone, Nanbield

## Quick Start

TBD

## Maintainers

* Dvorkin Dmitry `<dvorkin at tibbo.com>`
