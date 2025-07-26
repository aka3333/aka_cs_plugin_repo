plugins {
    id("com.android.library") // Android kütüphanesi için
    id("org.jetbrains.kotlin.android") // Kotlin desteği
    id("com.lagradost.cloudstream3") version "1.0.0" // CloudStream3 eklentisi
}

android {
    namespace = "com.example.aka_cs"
    compileSdk = 34 // Android SDK versiyonu

    defaultConfig {
        minSdk = 21 // Minimum Android versiyonu
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // CloudStream3 için gerekli bağımlılıklar
    implementation("com.lagradost:cloudstream3:VERSIYON") // GitHub'dan JitPack ile
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4") // Coroutines
}
