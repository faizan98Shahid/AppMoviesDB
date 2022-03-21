package com.example.appmoviesdb.network

class NetworkConfig
{
    companion object{
        const val CONNECTION_TIMEOUT:Long=120
        const val NETWORK_READ_TIMEOUT:Long=120
        const val NETWORK_WRITE_TIMEOUT:Long=120
        private const val MY_BASE_URL="https://api.themoviedb.org/3/movie/"
        const val BASE_URL= MY_BASE_URL
        private const val API_KEY="1369b3bdb34a7b8597519f9cd6a684cc"
        const val GET_UPCOMING_MOVIES = "upcoming?api_key=$API_KEY"
        const val GET_MOVIE_DETAILS = "{movie-id}?api_key=$API_KEY"
        const val GET_MOVIE_TRAILER = "{movie-id}/videos?api_key=$API_KEY"
        const val GET_MOVIE_IMAGES = "{movie-id}/images?api_key=$API_KEY"
    }
}