package com.example.appmoviesdb.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Movies")
data class MovieResponse(@ColumnInfo(name = "endPoint") var url: String,
                         @ColumnInfo(name = "response") var responseBody: String)
{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}