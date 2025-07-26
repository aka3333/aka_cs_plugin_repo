pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://jitpack.io")  // CloudStream eklentisi burada
        google()  // Android eklentileri için
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")  // CloudStream kütüphanesi
    }
}

rootProject.name = "aka_cs"  // Projenizin adı
include(":aka_cs")  // Modül adı
