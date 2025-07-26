plugins {
    id("com.android.library") version "8.3.2" // Güncel AGP versiyonu
    id("org.jetbrains.kotlin.android") version "1.9.22"
}

android {
    namespace = "com.example.aka_cs" // BU SATIR KRİTİK!
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
