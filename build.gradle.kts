plugins {
    kotlin("jvm") version "1.8.20" apply false
}

allprojects {
    repositories {
        mavenCentral()
        maven("https://jitpack.io")
    }
}
