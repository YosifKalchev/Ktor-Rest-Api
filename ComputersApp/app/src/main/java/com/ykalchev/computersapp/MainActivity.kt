package com.ykalchev.computersapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ykalchev.computersapp.ui.theme.RabbitsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RabbitsAppTheme {
                
            }
        }
    }
}