package com.apps_moviles.login_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.apps_moviles.login_app.navigation.NavigationWrapper
import com.apps_moviles.login_app.ui.theme.Login_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Login_appTheme {
                NavigationWrapper()
            }
        }
    }
}