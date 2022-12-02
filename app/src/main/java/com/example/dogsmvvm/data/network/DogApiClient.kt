package com.example.dogsmvvm.data.network

import com.example.dogsmvvm.data.model.DogModel
import retrofit2.Response
import retrofit2.http.GET

interface DogApiClient {
    @GET("/api/breeds/list/all")
    suspend fun getAllBreeds(): Response<DogModel>
}