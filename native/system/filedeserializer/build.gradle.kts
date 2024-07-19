plugins {
    kotlin("plugin.serialization") version "2.0.0"
}

kotlin {
    mingwX64("native")
    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
                implementation("org.jetbrains.kotlinx:kotlinx-io-core:0.4.0")
                implementation(project(":shared"))
            }
        }
    }
}
