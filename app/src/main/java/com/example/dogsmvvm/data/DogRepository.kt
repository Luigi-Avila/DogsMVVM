package com.example.dogsmvvm.data

import android.util.Log
import com.example.dogsmvvm.data.model.DogModel
import com.example.dogsmvvm.data.network.DogService

class DogRepository {
    private val api = DogService()

    suspend fun getDogs(): DogModel? {
        val response = api.getDogs()
        Log.i("response", "$response")
        return response
    }
}