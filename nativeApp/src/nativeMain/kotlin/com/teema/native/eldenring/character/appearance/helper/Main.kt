package com.teema.native.eldenring.character.appearance.helper

import kotlinx.cinterop.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import platform.windows.INPUT
import platform.windows.INPUT_KEYBOARD
import platform.windows.KEYEVENTF_KEYUP
import platform.windows.SendInput

val VK_Z = 0x5A.toUShort() // Virtual-Key code for 'Z'
val VK_X = 0x58.toUShort() // Virtual-Key code for 'X'

@ExperimentalForeignApi
fun main() {
    println("Hello, Kotlin/Native!")

    CoroutineScope(Dispatchers.Default).launch {
        delay(2000)
        sendKey(VK_Z)
        sendKey(VK_X)

        sendKey(VK_Z)
        sendKey(VK_X)

        sendKey(VK_Z)
        sendKey(VK_X)

        sendKey(VK_Z)
        sendKey(VK_X)
    }

    readln()
}

@ExperimentalForeignApi
fun sendKey(keyCode: UShort) {
    memScoped {
        val input = alloc<INPUT>()
        input.type = INPUT_KEYBOARD.toUInt()
        input.ki.wVk = keyCode
        input.ki.dwFlags = 0u // Key down

        // Send key down
        SendInput(1u, input.ptr, sizeOf<INPUT>().toInt())

        input.ki.dwFlags = KEYEVENTF_KEYUP.toUInt() // Key up

        // Send key up
        SendInput(1u, input.ptr, sizeOf<INPUT>().toInt())
    }
}
