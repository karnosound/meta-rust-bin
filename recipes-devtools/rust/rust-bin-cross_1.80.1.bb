
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "bb10d81717a7eb96d2c25b26fc3282fc",
        "aarch64-unknown-linux-musl": "db4afb65f0fc55a8baa3bea5d79647dd",
        "arm-unknown-linux-gnueabi": "a0697727281327132d7b1d94b5f85bee",
        "arm-unknown-linux-gnueabihf": "0b43c1d977c771625ddf3246beec3297",
        "armv5te-unknown-linux-gnueabi": "15121a0cef128d5ca8ef8cea21b76f93",
        "armv5te-unknown-linux-musleabi": "edc4b0cb663bd8a101d5f967cd37ba27",
        "armv7-unknown-linux-gnueabihf": "dec25371b7b398a012e6982d582c9ebf",
        "armv7-unknown-linux-musleabihf": "e34ba11ef6e9a0008968e656f3e29eac",
        "i686-unknown-linux-gnu": "dc6d4b23301374db6c64c1fdc6cd3719",
        "powerpc-unknown-linux-gnu": "ec95acfba5162c968756c869de05c6cf",
        "x86_64-unknown-linux-gnu": "bdfe4b5eee14d4fcb2192869c9dee3c1",
        "riscv64gc-unknown-linux-gnu": "91fed296e5f3a6353b52d78c33c5befe",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "2465f0df2ee35d32bd9690e05dd84d9c38bf81e8a5e9fd940d7347b66447c97f",
        "aarch64-unknown-linux-musl": "9ff88076cc699c5e5965f7ea99e2eae614a597c9002cdac0e24b4615f0e6b7e9",
        "arm-unknown-linux-gnueabi": "80c84eaef0e298fde9728bc985aeb0bb67efa9630db506ff56e54c31ea130574",
        "arm-unknown-linux-gnueabihf": "fce25b4bf41c1a89c165bc38e8f0d17f450f6b16a0b4df64ac027287ae7d19e7",
        "armv5te-unknown-linux-gnueabi": "30cd2b265a2e2e1e392146ff2e84771ec2f58243479135507ec4bf24308228d3",
        "armv5te-unknown-linux-musleabi": "b09b32487b09688e627db734c7541ce32507f782635dbe2bc00f2b6b67a7072c",
        "armv7-unknown-linux-gnueabihf": "449a79a9603f292bb2f5751d460241b38dca26d0c808a48cd2c0e13368b81e5c",
        "armv7-unknown-linux-musleabihf": "df308d1c930e77d62d49e7913bdb5ef08535e1350ab48345cb6fa518fb401f26",
        "i686-unknown-linux-gnu": "2e37cf2ccd7ea7ea96164924d5d430d5b7ab274b0d57d7c2802486025f3279ce",
        "powerpc-unknown-linux-gnu": "cb2c38a8134e3c8b0e93adbb2165e5d442527f863fdf5224808dc935860807a0",
        "x86_64-unknown-linux-gnu": "c58f796e884d5e8882e13775d726f514158aa5e26aef6c4f756bdacdbc1512bf",
        "riscv64gc-unknown-linux-gnu": "46bd7f87e9a9a8dd1dfd4ffd85b4741d1ddccd2224cebeeae921fca9a6f6e579",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "9875e8c0ad58e1b7575440739c704257",
        "arm-unknown-linux-gnueabi": "17a5f1b2dde963f17b9a73599c87869b",
        "arm-unknown-linux-gnueabihf": "d6eeebd4056ab68c48cfae5b06d1dedf",
        "armv7-unknown-linux-gnueabihf": "3b884d18e5728de4cb639a203cf001df",
        "i686-unknown-linux-gnu": "022f8270d6391a785e74b35d8742fe94",
        "x86_64-unknown-linux-gnu": "1a93b7d41fc95e5bed851ddd121736eb",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "b49e0806920cdb71f17a3fa3fb0763536a7f36ce87431f2088988c10ce3e3034",
        "arm-unknown-linux-gnueabi": "cdec7676ec46c5d4573d23d461d95dc51aac848a9b1520893f67e308a1723638",
        "arm-unknown-linux-gnueabihf": "1c46162973ec863a75c739bdaac580215e4558ab1933035a9db6e023638093e6",
        "armv7-unknown-linux-gnueabihf": "85fe3e5a44b8adcf0241997a45b4baabf875a48c45db67726464baa189a24f84",
        "i686-unknown-linux-gnu": "b7b3258672a3d5fc22e16d8d83135348118d22364566ed12cf81ce7702bc2268",
        "x86_64-unknown-linux-gnu": "c0eb2bd3f16ef51b2efe8d4f1febd93ad723cd694f16e0827b732b3a3b4b8dd9",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=c2cccf560306876da3913d79062a54b9"

require rust-bin-cross.inc
