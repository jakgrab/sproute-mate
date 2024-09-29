package org.example.sproutmate

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Sprout Mate",
    ) {
        App()
    }
}