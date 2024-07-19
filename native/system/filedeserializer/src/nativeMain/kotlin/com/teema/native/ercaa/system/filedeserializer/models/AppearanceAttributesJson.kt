package com.teema.native.ercaa.system.filedeserializer.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class AppearanceAttributes(
    @SerialName("CharacterCreation") val creation: CharacterCreation,
)

@Serializable
internal data class CharacterCreation(
    @SerialName("AlterFaceAndHair") val faceAndHair: FaceAndHair,
    @SerialName("AlterBody") val body: Body,
)

@Serializable
internal data class FaceAndHair(
    @SerialName("FaceTemplate") val faceTemplate: FaceTemplate,
    @SerialName("FaceStructure") val faceStructure: FaceStructure,
    @SerialName("Hair") val hair: Hair,
    @SerialName("Eyebrows") val eyebrows: Eyebrows,
    @SerialName("FacialHair") val facialHair: FacialHair,
    @SerialName("Eyelashes") val eyelashes: Eyelashes,
    @SerialName("Eyes") val eyes: Eyes,
    @SerialName("SkinFeatures") val skinFeatures: SkinFeatures,
    @SerialName("Cosmetics") val cosmetics: Cosmetics,
    @SerialName("Tattoos") val tattoos: Tattoos,
)

@Serializable
internal data class Body(
    @SerialName("Head") val head: Int,
    @SerialName("Chest") val chest: Int,
    @SerialName("Abdomen") val abdomen: Int,
    @SerialName("Arms") val arms: Int,
    @SerialName("Legs") val legs: Int,
    @SerialName("BodyHair") val bodyHair: Int,
    @SerialName("BodyHairColor") val bodyHairColor: String,
    @SerialName("Musculature") val musculature: String,
)
