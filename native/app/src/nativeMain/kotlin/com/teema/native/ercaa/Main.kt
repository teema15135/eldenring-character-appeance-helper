package com.teema.native.ercaa

import com.teema.native.ercaa.system.filedeserializer.read
import com.teema.native.ercaa.system.keyboard.output.VK_E
import com.teema.native.ercaa.system.keyboard.output.VK_Q
import com.teema.native.ercaa.system.keyboard.output.VK_X
import com.teema.native.ercaa.system.keyboard.output.VK_Z
import com.teema.native.ercaa.system.keyboard.output.sendKey
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@ExperimentalForeignApi
fun main() {
    println("Hello, Kotlin/Native!")

    val filePath = /* readlnOrNull() ?: */ "D:\\Projects\\IdeaProjects\\eldenring-character-appeance-helper\\example\\EldenRing-CharacterCreation.json"

    runCatching {
        read(filePath)
    }.fold({
        println(it)
    }, {
        it.printStackTrace()
    })


    runBlocking {
        delay(2000)
        sendKey(VK_Q)
        sendKey(VK_E)
        sendKey(VK_X)
        sendKey(VK_Z)
    }

    println("Complete")
}
