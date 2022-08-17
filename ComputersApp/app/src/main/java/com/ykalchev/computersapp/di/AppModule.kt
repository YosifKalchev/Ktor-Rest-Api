package com.ykalchev.computersapp.di

import com.ykalchev.computersapp.data.ComputersApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideComputersApi(): ComputersApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(ComputersApi.BASE_URL)
            .build()
            .create(ComputersApi::class.java)
    }
}