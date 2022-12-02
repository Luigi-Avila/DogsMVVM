package com.example.dogsmvvm.data.network

import android.util.Log
import com.example.dogsmvvm.core.RetrofitHelper
import com.example.dogsmvvm.data.model.DogModel
import com.example.dogsmvvm.data.model.Message
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DogService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getDogs(): DogModel? {
        return withContext(Dispatchers.IO){
            val result = retrofit.create(DogApiClient::class.java).getAllBreeds()
            Log.i("result --> ", "${result}")
            result.body() ?: null
        }

    }
}