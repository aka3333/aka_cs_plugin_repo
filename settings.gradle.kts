pluginManagement {
    repositories {
        gradlePluginPortal() // Standart Gradle eklentileri
        maven("https://jitpack.io") // JitPack (CloudStream3 burada olabilir)
        mavenCentral() // Maven deposu
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://jitpack.io") // JitPack'ten bağımlılıklar
    }
}

rootProject.name = "aka_cs" // Proje adınızı yazın
include(":aka_cs") // Modül adı
