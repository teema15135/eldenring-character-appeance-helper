pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "EldenRingCharacterAppearanceAssistant"

include(":native:app")
// project(":nativeApp").projectDir = file("native/app")

include(":native:system:filedeserializer")
include(":native:system:keyboardoutput")
// project(":native:system:filedeserializer").projectDir = file("native/system/filedeserializer")
