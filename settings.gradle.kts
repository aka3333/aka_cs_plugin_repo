pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://repo.maven.apache.org/maven2") }
    }
}

dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://jitpack.io") }
        mavenCentral()
    }
}

rootProject.name = "aka_cs_plugin_repo"
include(":aka_cs")
