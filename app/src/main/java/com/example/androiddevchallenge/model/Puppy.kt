package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class Puppy(
    val id: Long,
    val name: String,
    val gender: Gender,
    @DrawableRes val imageId: Int,
)

enum class Gender {
    FEMALE,
    MALE,
}

val puppies = listOf(
    Puppy(id = 1, name = "Bella", gender = Gender.FEMALE, imageId = R.drawable.puppy1),
    Puppy(id = 2, name = "Luna", gender = Gender.FEMALE, imageId = R.drawable.puppy2),
    Puppy(id = 3, name = "Lucy", gender = Gender.FEMALE, imageId = R.drawable.puppy3),
    Puppy(id = 4, name = "Max", gender = Gender.MALE, imageId = R.drawable.puppy4),
    Puppy(id = 5, name = "Bailey", gender = Gender.MALE, imageId = R.drawable.puppy5),
    Puppy(id = 6, name = "Cooper", gender = Gender.MALE, imageId = R.drawable.puppy6),
    Puppy(id = 7, name = "Daisy", gender = Gender.FEMALE, imageId = R.drawable.puppy7),
    Puppy(id = 8, name = "Sadie", gender = Gender.FEMALE, imageId = R.drawable.puppy8),
    Puppy(id = 9, name = "Molly", gender = Gender.FEMALE, imageId = R.drawable.puppy9),
    Puppy(id = 10, name = "Buddy", gender = Gender.MALE, imageId = R.drawable.puppy10),
)