plugins {
    kotlin("multiplatform") version "1.9.20-RC2"
    kotlin("plugin.serialization") version "2.0.0"
}

allprojects {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

subprojects {
    apply(plugin = "kotlin-multiplatform")
    apply(plugin = "kotlinx-serialization")
}

kotlin {
    mingwX64("native").apply {
        binaries {
            executable {
                entryPoint = "com.teema.native.eldenring.character.appearance.helper.main"
                runTask?.standardInput = System.`in`
            }
        }
    }
}