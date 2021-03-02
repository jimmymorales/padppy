package com.example.androiddevchallenge.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

@Composable
fun PuppyCard(
    name: String,
    gender: Gender,
    @DrawableRes imageId: Int = R.drawable.puppy1,
) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                Icon(
                    imageVector = when (gender) {
                        Gender.MALE -> Icons.Default.Male
                        Gender.FEMALE -> Icons.Default.Female
                    },
                    contentDescription = gender.description,
                    tint = MaterialTheme.colors.primary,
                )
            }
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "Picture of $name",
            )
            Text(text = name)
        }
    }
}

enum class Gender(val description: String) {
    FEMALE(description = "Female"),
    MALE(description = "Male"),
}

@Preview("Light Theme")
@Composable
fun LightPreview() {
    PaddpyTheme {
        PuppyCard(name = "Tom", gender = Gender.MALE)
    }
}

@Preview("Dark Theme")
@Composable
fun DarkPreview() {
    PaddpyTheme(darkTheme = true) {
        PuppyCard(name = "Petunia", gender = Gender.FEMALE)
    }
}