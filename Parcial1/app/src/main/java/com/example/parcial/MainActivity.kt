package com.example.parcial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.parcial.ui.theme.ParcialTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupView()
    }

    private fun setupView() {
        enableEdgeToEdge()
        setContent {
            ParcialTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login") {
                    composable("login") { LoginPage(navController) }
                    composable("welcome/{username}") { backStackEntry ->
                        val username = backStackEntry.arguments?.getString("username")
                        WelcomePage(username = username ?: "Usuario")
                    }
                }
            }
        }
    }
}

