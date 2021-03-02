package com.example.androiddevchallenge.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.components.PuppyCard
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

// Start building your app here!
@ExperimentalFoundationApi
@Composable
fun PadppyApp() {
    Scaffold {
        LazyVerticalGrid(
            cells = GridCells.Adaptive(minSize = 156.dp),
            contentPadding = PaddingValues(8.dp),
        ) {
            items(puppies) { puppy ->
                PuppyCard(puppy = puppy, modifier = Modifier.padding(8.dp))
            }
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