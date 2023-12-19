SUMMARY = "timer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit cmake

REPOSITORY_URI = "github.com/Morishing362/timer"
BRANCH = "main"
PROTOCOL = "https"
SRCREV = "0547478f5c5bb580f5a96e447509f76a766c2a5b"

SRC_URI = "git://${REPOSITORY_URI};protocol=${PROTOCOL};branch=${BRANCH}"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE = ""
