plugins {
    kotlin("multiplatform") version "1.9.20-RC2"
}

allprojects {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

subprojects {
    apply(plugin = "kotlin-multiplatform")
}

kotlin {
    mingwX64("native")
}
