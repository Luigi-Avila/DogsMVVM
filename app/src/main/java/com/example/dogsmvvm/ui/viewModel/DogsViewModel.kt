package com.example.dogsmvvm.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dogsmvvm.domain.GetListDogs
import kotlinx.coroutines.launch

class DogsViewModel: ViewModel() {

    var getListDogs = GetListDogs()


    fun onCreate(){
        viewModelScope.launch {
            Log.i("Hola", "Mundo")
            getListDogs()
        }
    }

}