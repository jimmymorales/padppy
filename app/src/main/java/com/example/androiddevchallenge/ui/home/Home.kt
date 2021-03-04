package com.example.androiddevchallenge.ui.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.home.components.PuppiesList

@ExperimentalFoundationApi
@Composable
fun Home() {
    Scaffold {
        PuppiesList(puppies = puppies, onPuppyClicked = ::println)
    }
}
