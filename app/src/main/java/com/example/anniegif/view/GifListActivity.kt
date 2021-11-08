package com.example.anniegif.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.anniegif.R
import com.example.anniegif.databinding.ActivityGiflistBinding

class GifListActivity : AppCompatActivity() {

    private val binding by lazy { ActivityGiflistBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}