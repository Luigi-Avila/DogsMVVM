package com.example.dogsmvvm.data

import android.util.Log
import com.example.dogsmvvm.data.model.Dog
import com.example.dogsmvvm.data.network.DogService

class DogRepository {
    private val api = DogService()

    suspend fun getDogs(): Any {
        val response = api.getDogs()
        Log.i("response", "$response")
        return response
    }
}