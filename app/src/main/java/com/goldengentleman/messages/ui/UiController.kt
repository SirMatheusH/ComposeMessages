package com.goldengentleman.messages.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf

class UiController {
    @Composable
    fun ApplicationScaffold() {
        Text("Application")
    }
}

val LocalUiController : ProvidableCompositionLocal<UiController> = staticCompositionLocalOf { error("UiController instance not provided.") }