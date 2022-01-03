package com.alexsav.weatherforecast.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alexsav.weatherforecast.screens.MainScreen
import com.alexsav.weatherforecast.screens.WeatherSplashScreen

@Composable
fun WeatherNav() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = WeatherScreens.SplashScreen.name) {
        // Splash Screen
        composable(WeatherScreens.SplashScreen.name){
            WeatherSplashScreen(navController = navController)
        }
        // Main Screen
        composable(WeatherScreens.MainScreen.name){
            MainScreen(navController = navController)
        }
    }
}