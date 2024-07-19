package com.teema.native.ercaa.shared.models

data class AppearanceAttributes(
    val creation: CharacterCreation,
)

data class CharacterCreation(
    val faceAndHair: FaceAndHair,
    val body: Body,
)

data class FaceAndHair(
    val faceTemplate: FaceTemplate,
    val faceStructure: FaceStructure,
    val hair: Hair,
    val eyebrows: Eyebrows,
    val facialHair: FacialHair,
    val eyelashes: Eyelashes,
    val eyes: Eyes,
    val skinFeatures: SkinFeatures,
    val cosmetics: Cosmetics,
    val tattoos: Tattoos,
)

data class FaceTemplate(
    val boneStructure: Int,
    val formEmphasis: Int,
    val apparentAge: Int,
    val facialAesthetic: Int,
)

data class FaceStructure(
    val facialBalance: FacialBalance,
    val foreheadGlabella: ForeheadGlabella,
    val browRidge: BrowRidge,
    val eyes: EyesStructure,
    val noseRidge: NoseRidge,
    val nostrils: Nostrils,
    val cheeks: Cheeks,
    val lips: Lips,
    val mouth: Mouth,
    val chin: Chin,
    val jaw: Jaw,
)

data class FacialBalance(
    val noseSize: Int,
    val noseForeheadRatio: Int,
    val faceProtrusion: Int,
    val verticalFaceRatio: Int,
    val facialFeatureSlant: Int,
    val horizontalFaceRatio: Int,
)

data class ForeheadGlabella(
    val foreheadDepth: Int,
    val foreheadProtrusion: Int,
    val noseBridgeHeight: Int,
    val bridgeProtrusion1: Int,
    val bridgeProtrusion2: Int,
    val noseBridgeWidth: Int,
)

data class BrowRidge(
    val browRidgeHeight: Int,
    val innerBrowRidge: Int,
    val outerBrowRidge: Int,
)

data class EyesStructure(
    val eyePosition: Int,
    val eyeSize: Int,
    val eyeSlant: Int,
    val eyeSpacing: Int,
)

data class NoseRidge(
    val noseRidgeDepth: Int,
    val noseRidgeLength: Int,
    val nosePosition: Int,
    val noseTipHeight: Int,
    val noseProtrusion: Int,
    val noseHeight: Int,
    val noseSlant: Int,
)

data class Nostrils(
    val nostrilSlant: Int,
    val nostrilSize: Int,
    val nostrilWidth: Int,
)

data class Cheeks(
    val cheekboneHeight: Int,
    val cheekboneDepth: Int,
    val cheekboneWidth: Int,
    val cheekboneProtrusion: Int,
    val cheeks: Int,
)

data class Lips(
    val lipShape: Int,
    val mouthExpression: Int,
    val lipFullness: Int,
    val lipSize: Int,
    val lipProtrusion: Int,
    val lipThickness: Int,
)

data class Mouth(
    val mouthProtrusion: Int,
    val mouthSlant: Int,
    val occlusion: Int,
    val mouthPosition: Int,
    val mouthWidth: Int,
    val mouthChinDistance: Int,
)

data class Chin(
    val chinTipPosition: Int,
    val chinLength: Int,
    val chinProtrusion: Int,
    val chinDepth: Int,
    val chinSize: Int,
    val chinHeight: Int,
    val chinWidth: Int,
)

data class Jaw(
    val jawProtrusion: Int,
    val jawWidth: Int,
    val lowerJaw: Int,
    val jawContour: Int,
)

data class Hair(
    val hair: Int,
    val hairColor: String,
    val luster: Int,
    val rootDarkness: Int,
    val whiteHairs: Int,
)

data class Eyebrows(
    val brow: Int,
    val browColor: String,
    val luster: String,
    val rootDarkness: String,
    val whiteHairs: String,
)

data class FacialHair(
    val beard: Int,
    val beardColor: String,
    val luster: String,
    val rootDarkness: String,
    val whiteHairs: String,
    val stubble: Int,
)

data class Eyelashes(
    val eyelashes: Int,
    val eyelashColor: String,
)

data class Eyes(
    val rightIrisSize: Int,
    val rightIrisColor: String,
    val rightEyeClouding: Int,
    val rightCloudingColor: String,
    val rightEyeWhiteColor: String,
    val rightEyePosition: Int,
    val leftIrisSize: String,
    val leftIrisColor: String,
    val leftEyeClouding: String,
    val leftCloudingColor: String,
    val leftEyeWhiteColor: String,
    val leftEyePosition: String,
)

data class SkinFeatures(
    val pores: Int,
    val skinLuster: Int,
    val darkCircles: Int,
    val darkCircleColor: String,
)

data class Cosmetics(
    val eyeliner: Int,
    val eyelinerColor: String,
    val eyeshadowUpper: Int,
    val eyeshadowColorUpper: String,
    val eyeshadowLower: Int,
    val eyeshadowColorLower: String,
    val cheeks: Int,
    val cheekColor: String,
    val lipstick: Int,
    val lipstickColor: String,
)

data class Tattoos(
    val tattooMark: Int,
    val tattooMarkColor: String,
    val tweakTattooMark: TweakTattooMark,
    val eyePath: Int,
    val eyePatchColor: String,
)

data class TweakTattooMark(
    val positionVertical: Int,
    val positionHorizontal: Int,
    val angle: Int,
    val expansion: Int,
    val flip: String,
)

data class Body(
    val head: Int,
    val chest: Int,
    val abdomen: Int,
    val arms: Int,
    val legs: Int,
    val bodyHair: Int,
    val bodyHairColor: String,
    val musculature: String,
)
