package com.example.appmoviesdb.activities

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.appmoviesdb.R
import com.example.appmoviesdb.viewmodels.MovieViewModel
import javax.inject.Inject

class MainActivity  constructor() : AppCompatActivity()
{
//    private val viewModel by viewModels<MovieViewModel>() { viewModelFactory }
//
//    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel:MovieViewModel
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this)
            .get(MovieViewModel::class.java)
        viewModel.setContext(this)
        viewModel.getUpComingMovies()
    }
}