package com.dicoding.resaipku

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable