package com.example.movieapp.data.vo

import com.google.gson.annotations.SerializedName

data class ShowResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val showList: List<Show>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)