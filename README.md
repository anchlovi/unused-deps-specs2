# unused-deps-specs2

In this example there is [one target](src/test/scala/com/comp/b/BUILD.bazel) that depends on specs2

Running: 
```
bazel build //src/test/scala/com/comp/b
```
Yields:
```
INFO: From scala //src/test/scala/com/comp/b:b:
warning: Target '@io_bazel_rules_scala_org_specs2_specs2_common//:io_bazel_rules_scala_org_specs2_specs2_common' is specified as a dependency to //sr
c/test/scala/com/comp/b:b but isn't used, please remove it from the deps.
You can use the following buildozer command:
buildozer 'remove deps @io_bazel_rules_scala_org_specs2_specs2_common//:io_bazel_rules_scala_org_specs2_specs2_common' //src/test/scala/com/comp/b:b
warning: Target '@io_bazel_rules_scala_org_specs2_specs2_fp//:io_bazel_rules_scala_org_specs2_specs2_fp' is specified as a dependency to //src/test/scala/com/comp/b:b but isn't used, please remove it from the deps.
You can use the following buildozer command:
buildozer 'remove deps @io_bazel_rules_scala_org_specs2_specs2_fp//:io_bazel_rules_scala_org_specs2_specs2_fp' //src/test/scala/com/comp/b:b
two warnings found
```

Removing any of the suggested unused deps will break the build
