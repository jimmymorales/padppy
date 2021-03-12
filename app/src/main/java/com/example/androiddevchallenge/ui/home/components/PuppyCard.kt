/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.components.description
import com.example.androiddevchallenge.ui.components.icon
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
