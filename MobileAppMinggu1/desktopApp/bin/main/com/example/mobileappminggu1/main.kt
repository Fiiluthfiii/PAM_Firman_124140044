package com.example.mobileappminggu1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MobileAppMinggu1",
    ) {
        App()
    }
}