package com.example.androiddevchallenge.ui.puppy_details

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.androiddevchallenge.ui.Screen

const val puppyIdArg = "puppyId"

fun Screen.PuppyDetails.routeWithParam(puppyId: Long) =
    route.replace("{$puppyIdArg}", puppyId.toString())

@Composable
fun PuppyDetails(navController: NavController, puppyId: Long) {
    Scaffold {
        Text(text = puppyId.toString())
    }
}