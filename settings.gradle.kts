pluginManagement {
    repositories {
        gradlePluginPortal()
        google() // Android plugin'leri için Google deposu EKLENDİ
        mavenCentral()
        maven("https://jitpack.io")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google() // Android bağımlılıkları için EKLENDİ
        mavenCentral()
        maven("https://jitpack.io")
    }
}

rootProject.name = "aka_cs"
include(":aka_cs")
