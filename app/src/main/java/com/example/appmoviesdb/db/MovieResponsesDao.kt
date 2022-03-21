package com.example.appmoviesdb.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Observable
import io.reactivex.Single

@Dao
abstract class MovieResponsesDao
{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    @JvmSuppressWildcards
    abstract fun insertResponse(response: MovieResponse)

    @Query("SELECT * FROM Movies WHERE endPoint = :endPoint")
    abstract fun getResponseAgainstUrl(endPoint: String): MovieResponse

    @Query( "DELETE FROM Movies WHERE endPoint = :endPoint")
    abstract fun clearResponseAgainstUrl(endPoint: String)

}