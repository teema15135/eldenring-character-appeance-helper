pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "EldenRingCharacterAppearanceAssistant"

include(":native:app")

include(":native:system:filedeserializer")
include(":native:system:keyboardoutput")

include(":shared")
