package com.example.anniegif.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.anniegif.R
import com.example.anniegif.databinding.ActivityMainBinding
import com.example.anniegif.viewmodel.AnnieViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<AnnieViewModel>()
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initCategoriesView()
        initGIFSView()

        viewModel.categories.observe(this) {
            // receive categories result here
            Log.d("give me categories", it.toString())
        }

        viewModel.gifs.observe(this) {
            // receive gifs result here
            Log.d("GIVE ME DA GIFS", it.url.toString())
        }

    }

    private fun initCategoriesView() = with(binding) {
        viewModel.getCategories()
    }

    private fun initGIFSView() = with(binding) {
        viewModel.getGIFS()
    }
}