package com.example.androiddevchallenge.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Gender
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.theme.PaddpyTheme

@Composable
fun PuppyCard(
    puppy: Puppy,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column(modifier = Modifier.padding(8.dp)) {
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                Icon(
                    imageVector = puppy.gender.icon,
                    contentDescription = puppy.gender.description,
                    tint = MaterialTheme.colors.primary,
                )
            }
            Image(
                painter = painterResource(id = puppy.imageId),
                contentDescription = "Picture of ${puppy.name}",
                modifier = Modifier.height(160.dp),
            )
            Text(text = puppy.name)
        }
    }
}

private val Gender.icon: ImageVector
    get() = when (this) {
        Gender.MALE -> Icons.Default.Male
        Gender.FEMALE -> Icons.Default.Female
    }

private val Gender.description: String
    get() = when (this) {
        Gender.MALE -> "Male"
        Gender.FEMALE -> "Female"
    }


@Preview("Light Theme", widthDp = 156)
@Composable
fun LightPreview() {
    PaddpyTheme {
        PuppyCard(puppies.first())
    }
}

@Preview("Dark Theme", widthDp = 156)
@Composable
fun DarkPreview() {
    PaddpyTheme(darkTheme = true) {
        PuppyCard(puppies.last())
    }
}