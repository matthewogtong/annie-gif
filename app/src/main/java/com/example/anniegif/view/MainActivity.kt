package com.example.anniegif.view

import android.content.Intent
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

    }

    private fun initViews() = with(binding) {
        viewModel.getCategories()
        val intent = Intent(binding.root.context, GifListActivity::class.java)
        btnBaka.setOnClickListener {
            viewModel.getGifs()
            startActivity(intent)
            //syntax for inside categories adapter
//            startActivity(binding.root.context, intent, null)
        }

    }
}