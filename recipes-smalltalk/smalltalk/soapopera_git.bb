DESCRIPTION = ""
HOMEPAGE = "https://gitorious.org/gnu-smalltalk-ports/soapopera"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

require smalltalk-package.inc

S = "${WORKDIR}/git"
SRC_URI = "git://gitorious.org/gnu-smalltalk-ports/soapopera.git;protocol=git;branch=master"
SRCREV = "21132f02889ef82e368144dbf8892d321d27661c"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"

