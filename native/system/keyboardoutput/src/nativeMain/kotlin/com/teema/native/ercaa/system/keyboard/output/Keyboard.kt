package com.teema.native.ercaa.system.keyboard.output

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.sizeOf
import platform.windows.INPUT
import platform.windows.INPUT_KEYBOARD
import platform.windows.KEYEVENTF_KEYUP
import platform.windows.SendInput

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
