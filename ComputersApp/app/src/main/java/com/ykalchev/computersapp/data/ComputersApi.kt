package com.ykalchev.computersapp.data

import retrofit2.http.GET

interface ComputersApi {

    @GET("/randomcomputer")
    suspend fun getRandomComputer(): Computer

    companion object {
        const val BASE_URL = "http://10.0.2.2:8080"
    }
}