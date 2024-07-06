plugins {
    kotlin("multiplatform") version "1.9.20-RC2"
}

kotlin {
    mingwX64("native")
    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
                implementation("org.jetbrains.kotlinx:kotlinx-io-core:0.4.0")
            }
        }
    }
}
