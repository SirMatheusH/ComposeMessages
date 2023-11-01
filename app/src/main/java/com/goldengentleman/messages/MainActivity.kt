package com.goldengentleman.messages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            (LocalContext.current.applicationContext as ApplicationController).ProvideCompositions {
                ApplicationScaffold()
            }
        }
    }
}

