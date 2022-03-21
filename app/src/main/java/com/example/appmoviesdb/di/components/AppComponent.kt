package com.example.appmoviesdb.di.components

import android.app.Application
import android.content.Context
import com.example.appmoviesdb.activities.MainActivity
//import com.example.appmoviesdb.di.modules.DataModule
//import com.example.appmoviesdb.di.modules.NetworkModule
//import com.example.appmoviesdb.di.modules.UIModule
import com.example.appmoviesdb.di.scopes.FeatureScope
import com.example.appmoviesdb.repositories.MovieRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


//@Singleton
//@Component(
//    modules = [UIModule::class, NetworkModule::class, DataModule::class]
//)
//interface AppComponent
//{
//
//    @Component.Builder
//    interface Builder
//    {
//        @BindsInstance
//        fun application(application: Application): Builder
//
//        fun build(): AppComponent
//    }
//
//
//    fun providesContext():Context
//
//
//
//    fun inject(activity: MainActivity)
//
//}