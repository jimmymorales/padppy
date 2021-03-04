package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.Screen
import com.example.androiddevchallenge.ui.home.components.PuppiesList
import com.example.androiddevchallenge.ui.puppy_details.routeWithParam

@ExperimentalFoundationApi
@Composable
fun Home(navController: NavHostController) {
    Scaffold {
        PuppiesList(
            puppies = puppies,
            onPuppyClicked = { puppy ->
                navController.navigate(
                    Screen.PuppyDetails.routeWithParam(puppy.id)
                )
            },
        )
    }
}
