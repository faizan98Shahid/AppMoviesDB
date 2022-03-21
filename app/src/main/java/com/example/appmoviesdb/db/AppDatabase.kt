package com.example.appmoviesdb.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MovieResponse::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase()
{
    abstract fun movieResponsesDao(): MovieResponsesDao
}
