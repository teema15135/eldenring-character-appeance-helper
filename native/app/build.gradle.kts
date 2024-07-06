group = "com.teema.native.eldenring.character.appearance.helper"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

kotlin {
    mingwX64("native").apply {
        binaries {
            executable {
                entryPoint = "com.teema.native.ercaa.main"
                runTask?.standardInput = System.`in`
            }
        }
    }
    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1-native-mt")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
                implementation(project(":native:system:keyboardoutput"))
                implementation(project(":native:system:filedeserializer"))
            }
        }
        val nativeTest by getting
    }
}
