package com.example.appmoviesdb.di.modules

import android.content.Context
import androidx.room.Room
import com.example.appmoviesdb.db.AppDatabase
import com.example.appmoviesdb.repositories.MovieRepository
import com.example.appmoviesdb.repositories.MovieRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

//@Module
//class DataModule
//{
//    @Singleton
//    @Provides
//    fun provideRoomDatabase(context: Context): AppDatabase
//    {
//        return Room.databaseBuilder(context, AppDatabase::class.java, "movies").build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideMovieRepository(movieRepository: MovieRepositoryImpl): MovieRepository = movieRepository
//
//
//
//
//
//}