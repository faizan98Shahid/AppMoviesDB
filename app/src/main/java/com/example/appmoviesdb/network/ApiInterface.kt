package com.example.appmoviesdb.network

import com.example.appmoviesdb.entities.response.*
import io.reactivex.Observable
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*


interface ApiInterface
{
    @GET(NetworkConfig.GET_UPCOMING_MOVIES)
    fun getUpcomingMovies(): Observable<MoviesListResponse>

    @GET(NetworkConfig.GET_MOVIE_DETAILS)
    fun getMovieDetails(@Path("movie-id") movieId: Int?): Observable<MovieDetailsResponse>

    @GET(NetworkConfig.GET_MOVIE_IMAGES)
    fun getMovieImages(@Path("movie-id") movieId: Int?): Observable<Response<ResponseBody>>

    @GET(NetworkConfig.GET_MOVIE_TRAILER)
    fun getMovieTrailer(@Path("movie-id") movieId: Int?): Observable<Response<ResponseBody>>

}