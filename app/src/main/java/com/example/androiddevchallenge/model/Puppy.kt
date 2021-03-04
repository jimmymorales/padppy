package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class Puppy(
    val name: String,
    val gender: Gender,
    @DrawableRes val imageId: Int,
)

enum class Gender {
    FEMALE,
    MALE,
}

val puppies = listOf(
    Puppy(name = "Bella", gender = Gender.FEMALE, imageId = R.drawable.puppy1),
    Puppy(name = "Luna", gender = Gender.FEMALE, imageId = R.drawable.puppy2),
    Puppy(name = "Lucy", gender = Gender.FEMALE, imageId = R.drawable.puppy3),
    Puppy(name = "Max", gender = Gender.MALE, imageId = R.drawable.puppy4),
    Puppy(name = "Bailey", gender = Gender.MALE, imageId = R.drawable.puppy5),
    Puppy(name = "Cooper", gender = Gender.MALE, imageId = R.drawable.puppy6),
    Puppy(name = "Daisy", gender = Gender.FEMALE, imageId = R.drawable.puppy7),
    Puppy(name = "Sadie", gender = Gender.FEMALE, imageId = R.drawable.puppy8),
    Puppy(name = "Molly", gender = Gender.FEMALE, imageId = R.drawable.puppy9),
    Puppy(name = "Buddy", gender = Gender.MALE, imageId = R.drawable.puppy10),
)