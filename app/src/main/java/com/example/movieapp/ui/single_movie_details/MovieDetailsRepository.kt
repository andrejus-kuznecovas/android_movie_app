package com.example.movieapp.ui.single_movie_details

import androidx.lifecycle.LiveData
import com.example.movieapp.data.api.TheMovieDBInterface
import com.example.movieapp.data.repository.MovieDetailsNetworkDataSource
import com.example.movieapp.data.repository.NetworkState
import com.oxcoding.moviemvvm.data.vo.MovieDetails
import io.reactivex.disposables.CompositeDisposable

class MovieDetailsRepository(private val apiService: TheMovieDBInterface) {
    lateinit var movieDetailsNetworkSource: MovieDetailsNetworkDataSource

    fun fetchSingleMovieDetails(
        compositeDisposable: CompositeDisposable,
        movieId: Int
    ): LiveData<MovieDetails> {
        movieDetailsNetworkSource = MovieDetailsNetworkDataSource(apiService, compositeDisposable)
        movieDetailsNetworkSource.fetchMovieDetails(movieId)

        return movieDetailsNetworkSource.downloadedMovieResponse
    }

    fun getMovieDetailsNetworkState(): LiveData<NetworkState> {
        return movieDetailsNetworkSource.networkState
    }
}