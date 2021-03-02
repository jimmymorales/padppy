package com.example.androiddevchallenge.ui

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.components.Gender
import com.example.androiddevchallenge.ui.components.PuppyCard
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

// Start building your app here!
@Composable
fun PadppyApp() {
    Scaffold {
        PuppyCard(name = "Tom", gender = Gender.MALE)
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    PaddpyTheme {
        PadppyApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    PaddpyTheme(darkTheme = true) {
        PadppyApp()
    }
}