package com.example.dogsmvvm.data.network

import com.example.dogsmvvm.core.RetrofitHelper
import com.example.dogsmvvm.data.model.Dog
import retrofit2.Response
import retrofit2.http.GET

interface DogApiClient {
    @GET("/breeds/list/all")
    suspend fun getAllBreeds(): Response<Any>
}