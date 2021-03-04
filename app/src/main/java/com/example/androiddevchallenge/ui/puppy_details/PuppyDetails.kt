package com.example.androiddevchallenge.ui.puppy_details

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.Screen
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

const val puppyIdArg = "puppyId"

fun Screen.PuppyDetails.routeWithParam(puppyId: Long) =
    route.replace("{$puppyIdArg}", puppyId.toString())

@Composable
fun PuppyDetails(puppyId: Long) {
    val puppy = puppies.first { it.id == puppyId }
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.Transparent,
                elevation = 0.dp,
            ) {
                Text(text = puppy.name)
            }
        }
    ) {
        Text(text = puppyId.toString())
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    PaddpyTheme {
        PuppyDetails(puppyId = 1)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    PaddpyTheme(darkTheme = true) {
        PuppyDetails(puppyId = 1)
    }
}