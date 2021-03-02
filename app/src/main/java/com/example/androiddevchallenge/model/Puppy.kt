package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class Puppy(
    val name: String,
    val gender: Gender,
    @DrawableRes val imageId: Int = R.drawable.puppy1,
)

enum class Gender {
    FEMALE,
    MALE,
}

val puppies = listOf(
    Puppy(name = "Tom", gender = Gender.MALE),
    Puppy(name = "Petunia", gender = Gender.FEMALE),
    Puppy(name = "Tin", gender = Gender.FEMALE),
)