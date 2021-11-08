package com.example.anniegif.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.anniegif.databinding.ActivityMainBinding
import com.example.anniegif.viewmodel.AnnieViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<AnnieViewModel>()
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViews()

        viewModel.categories.observe(this) {
            // receive categories result here
            Log.d("categories", it.toString())
        }

        viewModel.gifs.observe(this) {
            // receive gifs result here
            Log.d("gif url", it.url.toString())
        }

    }

    private fun initViews() = with(binding) {
        viewModel.getCategories()

        btnBaka.setOnClickListener {
            viewModel.getGifs()
        }

    }
}