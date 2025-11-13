package com.apps_moviles.login_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.apps_moviles.login_app.HomeScreen
import com.apps_moviles.login_app.LoginScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {

        composable<Login> {
            LoginScreen {
                    name -> navController.navigate(Home(name = name))
            }
        }

        composable<Home> { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: "Usuario"
            HomeScreen(username = name) {
                navController.navigate(Login)
            }
        }
    }
}