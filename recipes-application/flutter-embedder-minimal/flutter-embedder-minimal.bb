SUMMARY = "flutter-embedder-minimal"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit cmake pkgconfig

REPOSITORY_URI = "github.com/Morishing362/flutter-embedder-minimal"
BRANCH = "main"
PROTOCOL = "https"
SRCREV = "d77433469a8c646552ed625107a9912f79e5f8e6"

SRC_URI = "git://${REPOSITORY_URI};protocol=${PROTOCOL};branch=${BRANCH}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE = ""

