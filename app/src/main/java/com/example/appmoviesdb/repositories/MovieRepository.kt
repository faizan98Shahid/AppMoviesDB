package com.example.appmoviesdb.repositories

import com.example.appmoviesdb.entities.response.MoviesListResponse
import io.reactivex.Completable
import io.reactivex.Observable


interface MovieRepository
{

    fun getAllUpcomingMovies(isInternetConnected:Boolean=false): Observable<MoviesListResponse>


}