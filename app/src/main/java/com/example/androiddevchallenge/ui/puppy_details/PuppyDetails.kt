package com.example.androiddevchallenge.ui.puppy_details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.Screen
import com.example.androiddevchallenge.ui.components.PadppyTopAppBar
import dev.chrisbanes.accompanist.insets.statusBarsHeight

const val puppyIdArg = "puppyId"

fun Screen.PuppyDetails.routeWithParam(puppyId: Long) =
    route.replace("{$puppyIdArg}", puppyId.toString())

@Composable
fun PuppyDetails(puppyId: Long, navigateBack: () -> Unit) {
    // TODO: Move this to VM
    val puppy = puppies.first { it.id == puppyId }

    Scaffold {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsHeight()
                    .background(MaterialTheme.colors.background.copy(alpha = 0.9f))
            )
            PadppyTopAppBar(title = puppy.name, onBackPressed = navigateBack)
            Image(
                painter = painterResource(id = puppy.imageId),
                contentDescription = "Picture of ${puppy.name}",
                modifier = Modifier.weight(weight = 1f, fill = true).fillMaxSize(),
            )
        }
    }
}

