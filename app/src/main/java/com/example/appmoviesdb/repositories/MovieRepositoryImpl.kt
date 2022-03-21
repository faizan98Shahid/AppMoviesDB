package com.example.appmoviesdb.repositories

import com.example.appmoviesdb.db.AppDatabase
import com.example.appmoviesdb.db.MovieResponse
import com.example.appmoviesdb.entities.response.BaseResponse
import com.example.appmoviesdb.entities.response.MoviesListResponse
import com.example.appmoviesdb.network.ApiInterface
import com.example.appmoviesdb.network.NetworkConfig
import com.google.gson.GsonBuilder
import io.reactivex.Completable
import io.reactivex.Observable
import javax.inject.Inject

class MovieRepositoryImpl /*@Inject*/ constructor(private val api: ApiInterface/*, private val appDB: AppDatabase*/) : MovieRepository
{

    override fun getAllUpcomingMovies(isInternetConnected:Boolean): Observable<MoviesListResponse>
    {
        return if (isInternetConnected)
        {
            api.getUpcomingMovies().map {
//                appDB.movieResponsesDao().clearResponseAgainstUrl(NetworkConfig.GET_UPCOMING_MOVIES)
//                val gson = GsonBuilder().setPrettyPrinting().create()
//                appDB.movieResponsesDao().insertResponse(MovieResponse
//                    (NetworkConfig.GET_UPCOMING_MOVIES, gson.toJson(it)))
                return@map it
            }
        } else
        {
//            val movieResponse=appDB.movieResponsesDao().getResponseAgainstUrl(NetworkConfig.GET_UPCOMING_MOVIES)
//            val gson = GsonBuilder().setPrettyPrinting().create()
//            val response=gson.fromJson(movieResponse.responseBody,MoviesListResponse::class.java)
//            return if (response != null)
//            {
//                Observable.just(response)
//            } else
//            {
                Observable.just(BaseResponse() as MoviesListResponse?)
//            }
        }
    }


}