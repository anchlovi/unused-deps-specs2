workspace(name = "src_repo")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_scala_version="8724a32b45a7be02ec66aa64bb71fdd3d573fe9f" # update this as needed
rules_scala_version_sha256="7f4f1d09441d7b295d186a0dd928509345b75667b2efdd78d355ff57e3fc67cf"

http_archive(
    name = "io_bazel_rules_scala",
    url = "https://github.com/Jamie5/rules_scala/archive/%s.zip"%rules_scala_version,
    type = "zip",
    strip_prefix= "rules_scala-%s" % rules_scala_version,
    sha256 = rules_scala_version_sha256,
)


load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

register_toolchains("//:toolchain")

protobuf_version="09745575a923640154bcf307fba8aedff47f240a"
protobuf_version_sha256="416212e14481cff8fd4849b1c1c1200a7f34808a54377e22d7447efdf54ad758"

http_archive(
    name = "com_google_protobuf",
    url = "https://github.com/protocolbuffers/protobuf/archive/%s.tar.gz" % protobuf_version,
    strip_prefix = "protobuf-%s" % protobuf_version,
    sha256 = protobuf_version_sha256,
)

# bazel-skylib 0.8.0 released 2019.03.20 (https://github.com/bazelbuild/bazel-skylib/releases/tag/0.8.0)
skylib_version = "0.8.0"
http_archive(
    name = "bazel_skylib",
    type = "tar.gz",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib.{}.tar.gz".format (skylib_version, skylib_version),
    sha256 = "2ef429f5d7ce7111263289644d233707dba35e39696377ebab8b0bc701f7818e",
)

load("@io_bazel_rules_scala//specs2:specs2.bzl", "specs2_repositories")
specs2_repositories()