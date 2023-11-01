package com.goldengentleman.messages

import android.app.Application
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import com.goldengentleman.messages.ui.LocalUiController
import com.goldengentleman.messages.ui.UiController
import com.goldengentleman.messages.ui.theme.GoldenMessagesTheme

class ApplicationController : Application() {

    private lateinit var uiC: UiController

    override fun onCreate() {
        super.onCreate()
        uiC = UiController()
    }

    @Composable
    fun ProvideCompositions(content: @Composable UiController.() -> Unit) {
        GoldenMessagesTheme(darkTheme = isSystemInDarkTheme()) {
            CompositionLocalProvider(
                LocalUiController provides uiC,
                content = {
                    Surface(color = MaterialTheme.colorScheme.background, modifier = Modifier.fillMaxSize()){
                        LocalUiController.current.content()
                    }
                }
            )
        }
    }
}