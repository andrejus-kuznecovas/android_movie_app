package com.example.movieapp.data.vo

import com.google.gson.annotations.SerializedName

data class ShowDetails(
    val id: Int,
    val overview: String,
    val popularity: Double,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    val title: String,
    @SerializedName("vote_average")
    val rating: Double,
    @SerializedName("number_of_seasons")
    val seasons: Double
)