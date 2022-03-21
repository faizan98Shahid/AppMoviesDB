package com.example.appmoviesdb.viewmodels

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.example.appmoviesdb.db.AppDatabase
import com.example.appmoviesdb.entities.response.MoviesListResponse
import com.example.appmoviesdb.network.APIInterfaceImpl
import com.example.appmoviesdb.repositories.MovieRepository
import com.example.appmoviesdb.repositories.MovieRepositoryImpl
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@SuppressLint("StaticFieldLeak")
class MovieViewModel constructor(): ViewModel()
{
    lateinit var movieRepository: MovieRepository
    private lateinit var context: Context
    fun setContext(context:Context){
        this.movieRepository=MovieRepositoryImpl(APIInterfaceImpl.getAPIInterface()/*,provideRoomDatabase(context)*/)
        this.context=context
    }
    fun provideRoomDatabase(context: Context): AppDatabase
        {
            return Room.databaseBuilder(context, AppDatabase::class.java, "movies").build()
        }

    fun getUpComingMovies(){
        movieRepository.getAllUpcomingMovies(checkIfHasNetwork(context)).subscribeOn(Schedulers.newThread()).subscribeWith(object : DisposableObserver<MoviesListResponse>()
        {
            override fun onError(e: Throwable)
            {
                System.out.println("MovieList Response: ${e.toString()}")
            }

            override fun onNext(it: MoviesListResponse)
            {
                System.out.println("MovieList Response: ${movieRepository.toString()}")
            }

            override fun onComplete()
            {
                System.out.println("MovieList Response: OnComplate")
            }
        })
    }

    private fun checkIfHasNetwork(context: Context): Boolean
    {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }
}