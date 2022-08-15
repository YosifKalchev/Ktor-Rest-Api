package com.ykcoding.myapplication.data

import retrofit2.http.GET

interface ComputersApi {

    @GET("/randompc")
    suspend fun getRandomPc(): Computer

    companion object {
        const val BASE_URL = "http://localhost:8080"
    }
}