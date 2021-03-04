package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.Screen
import com.example.androiddevchallenge.ui.home.components.PuppiesList
import com.example.androiddevchallenge.ui.puppy_details.routeWithParam
import com.example.androiddevchallenge.ui.theme.PaddpyTheme
import dev.chrisbanes.accompanist.insets.LocalWindowInsets
import dev.chrisbanes.accompanist.insets.statusBarsHeight
import dev.chrisbanes.accompanist.insets.toPaddingValues

@ExperimentalFoundationApi
@Composable
fun Home(navController: NavHostController) {
    Scaffold {
        Box(Modifier.fillMaxSize()) {
            PuppiesList(
                puppies = puppies,
                onPuppyClicked = { puppy ->
                    navController.navigate(
                        Screen.PuppyDetails.routeWithParam(puppy.id)
                    )
                },
                contentPadding = LocalWindowInsets.current.systemBars.toPaddingValues()
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsHeight()
                    .background(MaterialTheme.colors.background.copy(alpha = 0.9f))
            )
        }
    }
}

@ExperimentalFoundationApi
@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    PaddpyTheme {
        Home(NavHostController(LocalContext.current))
    }
}

@ExperimentalFoundationApi
@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    PaddpyTheme(darkTheme = true) {
        Home(NavHostController(LocalContext.current))
    }
}
