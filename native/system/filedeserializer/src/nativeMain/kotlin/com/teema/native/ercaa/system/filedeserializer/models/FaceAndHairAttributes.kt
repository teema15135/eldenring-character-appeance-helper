package com.teema.native.ercaa.system.filedeserializer.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
internal data class FaceTemplate(
    @SerialName("BoneStructure") val boneStructure: Int,
    @SerialName("FormEmphasis") val formEmphasis: Int,
    @SerialName("ApparentAge") val apparentAge: Int,
    @SerialName("FacialAesthetic") val facialAesthetic: Int,
)

@Serializable
internal data class FaceStructure(
    @SerialName("FacialBalance") val facialBalance: FacialBalance,
    @SerialName("ForeheadGlabella") val foreheadGlabella: ForeheadGlabella,
    @SerialName("BrowRidge") val browRidge: BrowRidge,
    @SerialName("Eyes") val eyes: EyesStructure,
    @SerialName("NoseRidge") val noseRidge: NoseRidge,
    @SerialName("Nostrils") val nostrils: Nostrils,
    @SerialName("Cheeks") val cheeks: Cheeks,
    @SerialName("Lips") val lips: Lips,
    @SerialName("Mouth") val mouth: Mouth,
    @SerialName("Chin") val chin: Chin,
    @SerialName("Jaw") val jaw: Jaw,
)

@Serializable
internal data class FacialBalance(
    @SerialName("NoseSize") val noseSize: Int,
    @SerialName("NoseForeheadRatio") val noseForeheadRatio: Int,
    @SerialName("FaceProtrusion") val faceProtrusion: Int,
    @SerialName("VerticalFaceRatio") val verticalFaceRatio: Int,
    @SerialName("FacialFeatureSlant") val facialFeatureSlant: Int,
    @SerialName("HorizontalFaceRatio") val horizontalFaceRatio: Int,
)

@Serializable
internal data class ForeheadGlabella(
    @SerialName("ForeheadDepth") val foreheadDepth: Int,
    @SerialName("ForeheadProtrusion") val foreheadProtrusion: Int,
    @SerialName("NoseBridgeHeight") val noseBridgeHeight: Int,
    @SerialName("BridgeProtrusion1") val bridgeProtrusion1: Int,
    @SerialName("BridgeProtrusion2") val bridgeProtrusion2: Int,
    @SerialName("NoseBridgeWidth") val noseBridgeWidth: Int,
)

@Serializable
internal data class BrowRidge(
    @SerialName("BrowRidgeHeight") val browRidgeHeight: Int,
    @SerialName("InnerBrowRidge") val innerBrowRidge: Int,
    @SerialName("OuterBrowRidge") val outerBrowRidge: Int,
)

@Serializable
internal data class EyesStructure(
    @SerialName("EyePosition") val eyePosition: Int,
    @SerialName("EyeSize") val eyeSize: Int,
    @SerialName("EyeSlant") val eyeSlant: Int,
    @SerialName("EyeSpacing") val eyeSpacing: Int,
)

@Serializable
internal data class NoseRidge(
    @SerialName("NoseRidgeDepth") val noseRidgeDepth: Int,
    @SerialName("NoseRidgeLength") val noseRidgeLength: Int,
    @SerialName("NosePosition") val nosePosition: Int,
    @SerialName("NoseTipHeight") val noseTipHeight: Int,
    @SerialName("NoseProtrusion") val noseProtrusion: Int,
    @SerialName("NoseHeight") val noseHeight: Int,
    @SerialName("NoseSlant") val noseSlant: Int,
)

@Serializable
internal data class Nostrils(
    @SerialName("NostrilSlant") val nostrilSlant: Int,
    @SerialName("NostrilSize") val nostrilSize: Int,
    @SerialName("NostrilWidth") val nostrilWidth: Int,
)

@Serializable
internal data class Cheeks(
    @SerialName("CheekboneHeight") val cheekboneHeight: Int,
    @SerialName("CheekboneDepth") val cheekboneDepth: Int,
    @SerialName("CheekboneWidth") val cheekboneWidth: Int,
    @SerialName("CheekboneProtrusion") val cheekboneProtrusion: Int,
    @SerialName("Cheeks") val cheeks: Int,
)

@Serializable
internal data class Lips(
    @SerialName("LipShape") val lipShape: Int,
    @SerialName("MouthExpression") val mouthExpression: Int,
    @SerialName("LipFullness") val lipFullness: Int,
    @SerialName("LipSize") val lipSize: Int,
    @SerialName("LipProtrusion") val lipProtrusion: Int,
    @SerialName("LipThickness") val lipThickness: Int,
)

@Serializable
internal data class Mouth(
    @SerialName("MouthProtrusion") val mouthProtrusion: Int,
    @SerialName("MouthSlant") val mouthSlant: Int,
    @SerialName("Occlusion") val occlusion: Int,
    @SerialName("MouthPosition") val mouthPosition: Int,
    @SerialName("MouthWidth") val mouthWidth: Int,
    @SerialName("MouthChinDistance") val mouthChinDistance: Int,
)

@Serializable
internal data class Chin(
    @SerialName("ChinTipPosition") val chinTipPosition: Int,
    @SerialName("ChinLength") val chinLength: Int,
    @SerialName("ChinProtrusion") val chinProtrusion: Int,
    @SerialName("ChinDepth") val chinDepth: Int,
    @SerialName("ChinSize") val chinSize: Int,
    @SerialName("ChinHeight") val chinHeight: Int,
    @SerialName("ChinWidth") val chinWidth: Int,
)

@Serializable
internal data class Jaw(
    @SerialName("JawProtrusion") val jawProtrusion: Int,
    @SerialName("JawWidth") val jawWidth: Int,
    @SerialName("LowerJaw") val lowerJaw: Int,
    @SerialName("JawContour") val jawContour: Int,
)

@Serializable
internal data class Hair(
    @SerialName("Hair") val hair: Int,
    @SerialName("HairColor") val hairColor: String,
    @SerialName("Luster") val luster: Int,
    @SerialName("RootDarkness") val rootDarkness: Int,
    @SerialName("WhiteHairs") val whiteHairs: Int,
)

@Serializable
internal data class Eyebrows(
    @SerialName("Brow") val brow: Int,
    @SerialName("BrowColor") val browColor: String,
    @SerialName("Luster") val luster: String,
    @SerialName("RootDarkness") val rootDarkness: String,
    @SerialName("WhiteHairs") val whiteHairs: String,
)

@Serializable
internal data class FacialHair(
    @SerialName("Beard") val beard: Int,
    @SerialName("BeardColor") val beardColor: String,
    @SerialName("Luster") val luster: String,
    @SerialName("RootDarkness") val rootDarkness: String,
    @SerialName("WhiteHairs") val whiteHairs: String,
    @SerialName("Stubble") val stubble: Int,
)

@Serializable
internal data class Eyelashes(
    @SerialName("Eyelashes") val eyelashes: Int,
    @SerialName("EyelashColor") val eyelashColor: String,
)

@Serializable
internal data class Eyes(
    @SerialName("RightIrisSize") val rightIrisSize: Int,
    @SerialName("RightIrisColor") val rightIrisColor: String,
    @SerialName("RightEyeClouding") val rightEyeClouding: Int,
    @SerialName("RightCloudingColor") val rightCloudingColor: String,
    @SerialName("RightEyeWhiteColor") val rightEyeWhiteColor: String,
    @SerialName("RightEyePosition") val rightEyePosition: Int,
    @SerialName("LeftIrisSize") val leftIrisSize: String,
    @SerialName("LeftIrisColor") val leftIrisColor: String,
    @SerialName("LeftEyeClouding") val leftEyeClouding: String,
    @SerialName("LeftCloudingColor") val leftCloudingColor: String,
    @SerialName("LeftEyeWhiteColor") val leftEyeWhiteColor: String,
    @SerialName("LeftEyePosition") val leftEyePosition: String,
)

@Serializable
internal data class SkinFeatures(
    @SerialName("Pores") val pores: Int,
    @SerialName("SkinLuster") val skinLuster: Int,
    @SerialName("DarkCircles") val darkCircles: Int,
    @SerialName("DarkCircleColor") val darkCircleColor: String,
)

@Serializable
internal data class Cosmetics(
    @SerialName("Eyeliner") val eyeliner: Int,
    @SerialName("EyelinerColor") val eyelinerColor: String,
    @SerialName("EyeshadowUpper") val eyeshadowUpper: Int,
    @SerialName("EyeshadowColorUpper") val eyeshadowColorUpper: String,
    @SerialName("EyeshadowLower") val eyeshadowLower: Int,
    @SerialName("EyeshadowColorLower") val eyeshadowColorLower: String,
    @SerialName("Cheeks") val cheeks: Int,
    @SerialName("CheekColor") val cheekColor: String,
    @SerialName("Lipstick") val lipstick: Int,
    @SerialName("LipstickColor") val lipstickColor: String,
)

@Serializable
internal data class Tattoos(
    @SerialName("TattooMark") val tattooMark: Int,
    @SerialName("TattooMarkColor") val tattooMarkColor: String,
    @SerialName("TweakTattooMark") val tweakTattooMark: TweakTattooMark,
    @SerialName("EyePatch") val eyePatch: Int,
    @SerialName("EyePatchColor") val eyePatchColor: String,
)

@Serializable
internal data class TweakTattooMark(
    @SerialName("PositionVertical") val positionVertical: Int,
    @SerialName("PositionHorizontal") val positionHorizontal: Int,
    @SerialName("Angle") val angle: Int,
    @SerialName("Expansion") val expansion: Int,
    @SerialName("Flip") val flip: String,
)
