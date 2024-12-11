
# Recipe for cargo 20240808
# This corresponds to rust release 1.80.1

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "e9ea94da43a8eb7f01f92fd2624946a1",
        "arm-unknown-linux-gnueabi": "5e19f3aa6faaf58852de024bec65cf1a",
        "arm-unknown-linux-gnueabihf": "1f54b627cbb82c7e54077471406a839b",
        "armv7-unknown-linux-gnueabihf": "320529e85aefad447b16c7e454dca86a",
        "i686-unknown-linux-gnu": "616d03ff4fa98aa71a9689d82d4fbc7a",
        "x86_64-unknown-linux-gnu": "1c21a5bb27e367e5955c1dcc73645fd2",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "408fa85f211781c176c5f81b5272ef3ef0a84a71191c092c8a9f047ac110cf7c",
        "arm-unknown-linux-gnueabi": "6898fd5d51807513710e1df02dac0d10db0a895e90d8117ce4eee603ea9a242d",
        "arm-unknown-linux-gnueabihf": "d8d98791aa29deeafc29f5a6b2c8191d058d83c73c25a41f67601967629c621d",
        "armv7-unknown-linux-gnueabihf": "fc395b942c4290f189f6f09ed4ef73964762e7ae736c62f54afe12a5289bdfa0",
        "i686-unknown-linux-gnu": "4fa720198845ccc08bb463e3c66ecec90f25942a4f97e9b6dc15049278907823",
        "x86_64-unknown-linux-gnu": "67c9c24442879316f42cd77ef8f680979a0a100557c563e2ff5a58588f67b36f",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-08-08/cargo-1.80.1-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2024-08-08/cargo-1.80.1-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-08-08/cargo-1.80.1-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2024-08-08/cargo-1.80.1-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-08-08/cargo-1.80.1-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2024-08-08/cargo-1.80.1-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= 1.80.1)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
