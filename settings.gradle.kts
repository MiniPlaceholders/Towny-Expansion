enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "Example-Expansion"

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

arrayOf("common", "paper", "velocity").forEach {
    include("example-expansion-$it")

    project(":example-expansion-$it").projectDir = file(it)
}

