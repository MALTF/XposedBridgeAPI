enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("core/gradle/libs.versions.toml"))
        }
        create("lspatch") {
            from(files("gradle/lspatch.versions.toml"))
        }
    }
}

rootProject.name = "LSPatch"
include(
    ...
    ":api",
    ":core",
    ":hiddenapi:bridge",
    ":hiddenapi:stubs",
    ...
)

project(":core").projectDir = file("core/core")
project(":hiddenapi:bridge").projectDir = file("core/hiddenapi/bridge")
project(":hiddenapi:stubs").projectDir = file("core/hiddenapi/stubs")

buildCache { local { removeUnusedEntriesAfterDays = 1 } }
