package com.example.androiddevchallenge.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.home.Home
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

// Start building your app here!
@ExperimentalFoundationApi
@Composable
fun PadppyApp() {
    Home()
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