package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

// Start building your app here!
@Composable
fun PadppyApp() {
    Scaffold {
        Card(modifier = Modifier.width(180.dp).padding(16.dp),) {
            Column(modifier = Modifier.padding(8.dp)) {
                Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                    Icon(
                        imageVector = Icons.Default.Male,
                        contentDescription = "Male",
                        tint = MaterialTheme.colors.primary,
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.puppy1),
                    contentDescription = "Picture of Tom",
                )
                Text(text = "Tom")
            }
        }
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