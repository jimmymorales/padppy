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
package com.example.androiddevchallenge.ui.puppy_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.Screen
import com.example.androiddevchallenge.ui.components.PadppyTopAppBar
import com.example.androiddevchallenge.ui.components.description
import com.example.androiddevchallenge.ui.components.icon
import com.example.androiddevchallenge.ui.puppy_details.components.CongratsSnackbar
import com.example.androiddevchallenge.ui.puppy_details.components.PuppyDescriptionSurface
import dev.chrisbanes.accompanist.insets.statusBarsHeight
import kotlinx.coroutines.launch

const val puppyIdArg = "puppyId"

fun Screen.PuppyDetails.routeWithParam(puppyId: Long) =
    route.replace("{$puppyIdArg}", puppyId.toString())

@Composable
fun PuppyDetails(puppyId: Long, navigateBack: () -> Unit) {
    // TODO: Move this to VM
    val puppy = puppies.first { it.id == puppyId }

    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsHeight()
                    .background(MaterialTheme.colors.background.copy(alpha = 0.9f))
            )
            PadppyTopAppBar(
                title = puppy.name,
                onBackPressed = navigateBack,
                actions = {
                    Icon(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        imageVector = puppy.gender.icon,
                        contentDescription = puppy.gender.description,
                        tint = MaterialTheme.colors.primary,
                    )
                },
            )
            Image(
                painter = painterResource(id = puppy.imageId),
                contentDescription = "Picture of ${puppy.name}",
                modifier = Modifier
                    .weight(weight = 1f, fill = true)
                    .fillMaxSize()
                    .padding(16.dp),
            )
            PuppyDescriptionSurface(
                modifier = Modifier.weight(weight = 1f, fill = true),
                puppy = puppy,
                onAdoptClicked = {
                    scope.launch {
                        snackbarHostState.showSnackbar(
                            message = "Congratulations! You have adopted ${puppy.name}"
                        )
                    }
                },
            )
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        CongratsSnackbar(
            snackbarHostState = snackbarHostState,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}
