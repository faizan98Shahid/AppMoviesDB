package com.example.appmoviesdb.entities.response

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MovieDetailsResponse(
    @SerializedName("adult") var adult: Boolean,
    @SerializedName("backdrop_path") var backdropPath: String,
    @SerializedName("belongs_to_collection") var belongsToCollection: MovieCollection,
    @SerializedName("budget") var budget: Float,
    @SerializedName("genres") var genres: ArrayList<MovieGenres>,
    @SerializedName("homepage") var homepage: String,
    @SerializedName("imdb_id") var imdbId: Int,
    @SerializedName("id") var movieId: Int,
    @SerializedName("original_language") var originalLanguage: String,
    @SerializedName("original_title") var originalTitle: String,
    @SerializedName("overview") var overview: String,
    @SerializedName("popularity") var popularity: Double,
    @SerializedName("poster_path") var posterPath: String,
    @SerializedName("production_companies") var productionCompanies: ArrayList<ProductionCompanies>,
    @SerializedName("production_countries") var productionCountries: ArrayList<ProductionCountries>,
    @SerializedName("revenue") var revenue: Float,
    @SerializedName("runtime") var runtime: Float,
    @SerializedName("spoken_languages") var spokenLanguages: ArrayList<SpokenLanguages>,
    @SerializedName("status") var status: String,
    @SerializedName("tagline") var tagline: String,
    @SerializedName("release_date") var releaseDate: String,
    @SerializedName("title") var title: String,
    @SerializedName("video") var video: Boolean,
    @SerializedName("vote_average") var voteAverage: Float,
    @SerializedName("vote_count") var voteCount: Int
    ): BaseResponse(),Serializable

data class MovieCollection(
    @SerializedName("id") var collectionId:Int,
    @SerializedName("name") var collectionName:String,
    @SerializedName("poster_path") var collectionPosterPath:String,
    @SerializedName("backdrop_path") var collectionBackdropPath:String
): Serializable

data class MovieGenres(
    @SerializedName("id") var genresId:Int,
    @SerializedName("name") var genresName:String
): Serializable

data class ProductionCompanies(
    @SerializedName("id") var productionCompanyId:Int,
    @SerializedName("logo_path") var productionCompanyLogoPath:String,
    @SerializedName("name") var productionCompanyName:String,
    @SerializedName("origin_country") var productionCompanyCountry:String
): Serializable

data class ProductionCountries(
    @SerializedName("iso_3166_1") var productionCountryId:String,
    @SerializedName("name") var productionCountryName:String
): Serializable

data class SpokenLanguages(
    @SerializedName("iso_639_1") var languageId:String,
    @SerializedName("name") var languageName:String,
    @SerializedName("english_name") var languageEnglishName:String
): Serializable


