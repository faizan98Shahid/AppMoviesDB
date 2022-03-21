package com.example.appmoviesdb.network

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object APIInterfaceImpl  {

    fun getAPIInterface():ApiInterface{
        return providesApiInterface(provideClientBuilder(),provideInterceptors())
    }

    private fun provideClientBuilder(): OkHttpClient.Builder
    {
        return OkHttpClient.Builder()

            .connectTimeout(NetworkConfig.CONNECTION_TIMEOUT, TimeUnit.SECONDS)

            .readTimeout(NetworkConfig.NETWORK_READ_TIMEOUT, TimeUnit.SECONDS)

            .writeTimeout(NetworkConfig.NETWORK_WRITE_TIMEOUT, TimeUnit.SECONDS)
    }

    private fun provideInterceptors(): ArrayList<Interceptor>
    {
        val interceptors = arrayListOf<Interceptor>()

        val keyInterceptor = Interceptor { chain ->

            val original = chain.request()
            val originalHttpUrl = original.url

            val url = originalHttpUrl.newBuilder().build()

            val requestBuilder = original.newBuilder().url(url)

            val request = requestBuilder.build()
            return@Interceptor chain.proceed(request)
        }

        interceptors.add(keyInterceptor)
        interceptors.add(makeLoggingInterceptor(true))

        return interceptors
    }


    private fun providesApiInterface(
        clientBuilder: OkHttpClient.Builder,
        interceptors: ArrayList<Interceptor>
    ): ApiInterface
    {
        if (interceptors.isNotEmpty())
        {
            interceptors.forEach { interceptor ->
                clientBuilder.addInterceptor(interceptor)
            }
        }

        val okHttpClient: OkHttpClient = clientBuilder.build()

        val retrofitBuilder = Retrofit.Builder()

            .client(okHttpClient)

            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

            .addConverterFactory(GsonConverterFactory.create())

        return retrofitBuilder

            .baseUrl(NetworkConfig.BASE_URL)

            .build()

            .create(ApiInterface::class.java)
    }

    private fun makeLoggingInterceptor(isDebug: Boolean): HttpLoggingInterceptor
    {
        return HttpLoggingInterceptor().apply {
            level = if (isDebug)
            {
                HttpLoggingInterceptor.Level.BODY
            } else
            {
                HttpLoggingInterceptor.Level.NONE
            }
        }
    }
}