package com.example.androiddevchallenge.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.androiddevchallenge.model.Gender

val Gender.icon: ImageVector
    get() = when (this) {
        Gender.MALE -> Icons.Default.Male
        Gender.FEMALE -> Icons.Default.Female
    }

val Gender.description: String
    get() = when (this) {
        Gender.MALE -> "Male"
        Gender.FEMALE -> "Female"
    }
