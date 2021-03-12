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
package com.example.androiddevchallenge.model

import androidx.annotation.DrawableRes
import com.example.androiddevchallenge.R

data class Puppy(
    val id: Long,
    val name: String,
    val gender: Gender,
    @DrawableRes val imageId: Int,
    val description: String,
)

enum class Gender {
    FEMALE,
    MALE,
}

val puppies = listOf(
    Puppy(
        id = 1,
        name = "Bella",
        gender = Gender.FEMALE,
        imageId = R.drawable.puppy1,
        description = """
            Hey guys the names Bella! I am a 4 year old female dog looking for my 
            ideal home! If you have the patience, time, and experience and are willing to put a 
            lot of work in, I could be a great companion.
        """.trimIndent(),
    ),
    Puppy(
        id = 2,
        name = "Luna",
        gender = Gender.FEMALE,
        imageId = R.drawable.puppy2,
        description = """
            HEY GUYS THE NAMES LUNA! I AM A 5 YEAR OLD DOG LOOKING FOR MY IDEAL HOME! WHAT CAN I 
            SAY ABOUT MYSELF? I AM A SILLY, SOCIAL AND PLAYFUL GUY LOOKING FOR A COMPANION TO HELP 
            KEEP ME COMPANY.
        """.trimIndent(),
    ),
    Puppy(
        id = 3,
        name = "Lucy",
        gender = Gender.FEMALE,
        imageId = R.drawable.puppy3,
        description = """
            Lucy is a 3 yr old ball of love who is currently going through a very stressful 
            transition and is exhibiting some behavioral issues. She needs a experienced owner who 
            has the time to take care of her needs.
        """.trimIndent(),
    ),
    Puppy(
        id = 4,
        name = "Max",
        gender = Gender.MALE,
        imageId = R.drawable.puppy4,
        description = """
            Max is a very shy, sweet dog and will need someone to get to know him and have patience 
            and give him time to get to know them. Once he is comfortable with you, he will be your 
            best friend.
        """.trimIndent(),
    ),
    Puppy(
        id = 5,
        name = "Bailey",
        gender = Gender.MALE,
        imageId = R.drawable.puppy5,
        description = """
            Bailey likes meeting new people and loves to play. He has a lot of energy too, so he 
            would be great for someone that has an active lifestyle and wants to take their 
            4-legged buddy on adventures.
        """.trimIndent(),
    ),
    Puppy(
        id = 6,
        name = "Cooper",
        gender = Gender.MALE,
        imageId = R.drawable.puppy6,
        description = """
            Meet Cooper! He is an alert, confident, happy, outgoing, and energetic dog. Cooper can 
            be calm sitting and hangout, but he also likes going on walks and saying hi to people. 
            He is making wonderful progress at the shelter where our volunteers love to take him 
            for walks and teach him good manners!
        """.trimIndent(),
    ),
    Puppy(
        id = 7,
        name = "Daisy",
        gender = Gender.FEMALE,
        imageId = R.drawable.puppy7,
        description = """
            Daisy is an older girl and has been with our sister rescue waiting for her people to 
            find her! She is playful, LOVES her tennis ball and makes the funniest faces, but she 
            appreciates just lounging around too.
        """.trimIndent(),
    ),
    Puppy(
        id = 8,
        name = "Sadie",
        gender = Gender.FEMALE,
        imageId = R.drawable.puppy8,
        description = """
            Sadie is a shy girl who she needs some time to warm up to people but she is sweet once 
            she knows you. Sadie is currently in a foster home and she is enjoying her time with 
            her foster brother.
        """.trimIndent(),
    ),
    Puppy(
        id = 9,
        name = "Molly",
        gender = Gender.FEMALE,
        imageId = R.drawable.puppy9,
        description = """
            Molly is a quiet and timid dog. She is very sh, but does surprisingly well with other 
            dogs. She is medium sized, but more on the smaller side. Molly is currently in a foster 
            home and she is doing amazing!
        """.trimIndent(),
    ),
    Puppy(
        id = 10,
        name = "Buddy",
        gender = Gender.MALE,
        imageId = R.drawable.puppy10,
        description = """
            Buddy is a quiet, docile and submissive doggie. Buddy might be a little shy at first 
            but he will warm up to you with time, especially if you have treats! He will follow 
            you around and will slowly try to get close to you.
        """.trimIndent(),
    ),
)
