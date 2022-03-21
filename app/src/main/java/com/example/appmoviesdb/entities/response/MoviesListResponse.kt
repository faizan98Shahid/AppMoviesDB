package com.example.appmoviesdb.entities.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import kotlin.collections.ArrayList

data class MoviesListResponse(
    @SerializedName("dates") var dates: Dates,
    @SerializedName("results") var results: ArrayList<MovieInfo>,
    @SerializedName("page") var page: Int,
    @SerializedName("total_pages") var totalPages: Int,
    @SerializedName("total_results") val totalResults: Int
) : BaseResponse(), Serializable


data class Dates(
    @SerializedName("maximum") var maximum: String, @SerializedName("minimum") var minimum: String
) : Serializable

data class MovieInfo(
    @SerializedName("adult") var adult: Boolean,
    @SerializedName("backdrop_path") var backdropPath: String,
    @SerializedName("genre_ids") var genreIds: ArrayList<Int>,
    @SerializedName("id") var movieId: Int,
    @SerializedName("original_language") var originalLanguage: String,
    @SerializedName("original_title") var originalTitle: String,
    @SerializedName("overview") var overview: String,
    @SerializedName("popularity") var popularity: Double,
    @SerializedName("poster_path") var posterPath: String,
    @SerializedName("release_date") var releaseDate: String,
    @SerializedName("title") var title: String,
    @SerializedName("video") var video: Boolean,
    @SerializedName("vote_average") var voteAverage: Float,
    @SerializedName("vote_count") var voteCount: Int
) : Serializable

