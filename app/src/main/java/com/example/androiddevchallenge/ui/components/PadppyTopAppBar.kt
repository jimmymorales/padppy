package com.example.androiddevchallenge.ui.components

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

@Composable
fun PadppyTopAppBar(title: String, onBackPressed: () -> Unit) {
    TopAppBar(
        title = { Text(text = title) },
        elevation = 0.dp,
        backgroundColor = Color.Transparent,
        navigationIcon = {
            IconButton(onClick = onBackPressed) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back button")
            }
        }
    )
}

@Preview("Top app bar")
@Composable
fun PadppyTopAppBarPreview() {
    PaddpyTheme {
        PadppyTopAppBar(title = "Bella", onBackPressed = {})
    }
}
