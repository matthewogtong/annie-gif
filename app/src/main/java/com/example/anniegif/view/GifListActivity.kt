package com.example.anniegif.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.anniegif.R
import com.example.anniegif.adapter.GifListAdapter
import com.example.anniegif.databinding.ActivityGiflistBinding
import com.example.anniegif.viewmodel.AnnieViewModel

class GifListActivity : AppCompatActivity() {

    private val binding by lazy { ActivityGiflistBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<AnnieViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d("gif_url", "on create")

        initViews()

        viewModel.gifs.observe(this) {
            // receive gifs result here
            Log.d("gif_url", it.toString())
            with(binding) {
                (rvGifs.adapter as GifListAdapter).updateGifs(it)
            }
        }
    }
    private fun initViews() = with(binding) {
        viewModel.getGifs()
        rvGifs.adapter = GifListAdapter()
    }
}