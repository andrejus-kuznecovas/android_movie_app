package com.example.movieapp.data.vo


import com.google.gson.annotations.SerializedName

data class Movie(
    val id: Int,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("first_air_date")
    val releaseDate: String,
    val title: String
)