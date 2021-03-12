/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.home.Home
import com.example.androiddevchallenge.ui.puppy_details.PuppyDetails
import com.example.androiddevchallenge.ui.puppy_details.puppyIdArg
import com.example.androiddevchallenge.ui.puppy_details.routeWithParam
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
        composable(route = Screen.Home.route) {
            Home(
                navigateToPuppyDetails = { puppyId ->
                    navController.navigate(Screen.PuppyDetails.routeWithParam(puppyId))
                }
            )
        }
        composable(
            route = Screen.PuppyDetails.route,
            arguments = listOf(navArgument(name = puppyIdArg) { type = NavType.LongType })
        ) { navBackStackEntry ->
            PuppyDetails(
                puppyId = navBackStackEntry.arguments?.getLong(puppyIdArg) ?: 0,
                navigateBack = navController::popBackStack
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
