package com.example.movieapp.data.api

import com.example.movieapp.data.vo.MovieResponse
import com.example.movieapp.data.vo.ShowDetails
import com.example.movieapp.data.vo.ShowResponse
import com.oxcoding.moviemvvm.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>

    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Single<MovieResponse>


    @GET("tv/{tv_id}")
    fun getShowDetails(@Path("tv_id") id: Int): Single<ShowDetails>

    @GET("tv/popular")
    fun getPopularShow(@Query("") page: Int): Single<ShowResponse>


}