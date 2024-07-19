package com.teema.native.ercaa.system.filedeserializer

import com.teema.native.ercaa.system.filedeserializer.models.AppearanceAttributes
import kotlinx.serialization.json.Json

fun readToModel(filepath: String) {
    val rawJson = read(filepath)
    deserialize(rawJson)
}

internal fun deserialize(rawJson: String) {
    val json = Json { isLenient = true }
    val model = json.decodeFromString<AppearanceAttributes>(rawJson)
    println(model)
}
