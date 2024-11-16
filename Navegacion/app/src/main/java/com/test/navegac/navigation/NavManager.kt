package com.test.navegac.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.test.navegac.views.DetailView
import com.test.navegac.views.HomeView

@Composable
fun NavMananger(){
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable(route = "Home"){
            HomeView(navController)
        }

        composable(route = "Detail/{id}", arguments = listOf(
            navArgument(name = "id"){type = NavType.IntType},
        )){
            var id= it.arguments?.getInt("id") ?:0

            DetailView(navController,id)
        }
    }
}