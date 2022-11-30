package com.example.dogsmvvm.domain

import com.example.dogsmvvm.data.DogRepository
import com.example.dogsmvvm.data.model.Dog

class GetListDogs {
    private val repository = DogRepository()
    suspend operator fun invoke(): Any = repository.getDogs()
}