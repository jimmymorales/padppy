package com.example.androiddevchallenge.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.home.Home
import com.example.androiddevchallenge.ui.puppy_details.PuppyDetails
import com.example.androiddevchallenge.ui.puppy_details.puppyIdArg
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

sealed class Screen(val route: String) {
    object Home : Screen(route = "home")
    object PuppyDetails : Screen(route = "details/{$puppyIdArg}")
}

// Start building your app here!
@ExperimentalFoundationApi
@Composable
fun PadppyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) { Home(navController) }
        composable(
            route = Screen.PuppyDetails.route,
            arguments = listOf(navArgument(name = puppyIdArg) { type = NavType.LongType })
        ) { navBackStackEntry ->
            PuppyDetails(
                navController = navController,
                puppyId = navBackStackEntry.arguments?.getLong(puppyIdArg) ?: 0
            )
        }
    }
}

@ExperimentalFoundationApi
@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    PaddpyTheme {
        PadppyApp()
    }
}

@ExperimentalFoundationApi
@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    PaddpyTheme(darkTheme = true) {
        PadppyApp()
    }
}