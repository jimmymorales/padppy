package com.example.androiddevchallenge.ui.home.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Puppy

@ExperimentalFoundationApi
@Composable
fun PuppiesList(
    puppies: List<Puppy>,
    onPuppyClicked: (Puppy) -> Unit = {},
) {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(minSize = 156.dp),
        contentPadding = PaddingValues(8.dp),
    ) {
        items(puppies) { puppy ->
            PuppyCard(
                puppy = puppy,
                modifier = Modifier
                    .padding(8.dp)
                    .clickable(onClick = {
                        onPuppyClicked(puppy)
                    }),
            )
        }
    }
}
