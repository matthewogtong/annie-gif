package com.example.anniegif.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.anniegif.databinding.ActivityFullScreenGifBinding

class FullScreenGifActivity : AppCompatActivity() {

    private val binding by lazy { ActivityFullScreenGifBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}