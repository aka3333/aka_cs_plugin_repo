// Üst kısma bu blok EKLENDİ
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.3.2") // Android Gradle Plugin
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22") // Kotlin Plugin
    }
}

plugins {
    id("com.android.library") // Artık bulunabilecek
    id("org.jetbrains.kotlin.android")
    id("com.lagradost.cloudstream3") version "4.3.4" // CloudStream eklentisi
}

android {
    namespace = "com.example.aka_cs"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }

    // ... (diğer android ayarları aynı)
}

dependencies {
    implementation("com.github.Lagradost:CloudStream-3:4.3.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
}
