package com.example.dogsmvvm.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.dogsmvvm.R
import com.example.dogsmvvm.databinding.ActivityMainBinding
import com.example.dogsmvvm.ui.viewModel.DogsViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val dogViewModel: DogsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dogViewModel.onCreate()
    }
}