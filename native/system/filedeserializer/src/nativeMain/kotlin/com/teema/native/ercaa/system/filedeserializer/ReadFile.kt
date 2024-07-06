package com.teema.native.ercaa.system.filedeserializer

import kotlinx.io.buffered
import kotlinx.io.files.FileNotFoundException
import kotlinx.io.files.Path
import kotlinx.io.files.SystemFileSystem
import kotlinx.io.readLine

fun read(filepath: String): String {
    if (!SystemFileSystem.exists(Path(filepath))) {
        throw FileNotFoundException(Path(filepath).parent.toString()) // zxzxzxzx
    }
    val source = SystemFileSystem.source(Path(filepath))
    source.buffered().let { buffer ->
        val stringBuilder = StringBuilder()
        while (true) {
            val line = buffer.readLine() ?: break
            stringBuilder.append(line)
        }
        return stringBuilder.toString()
    }
}
