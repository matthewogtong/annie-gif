package com.example.anniegif.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.anniegif.databinding.ActivityCategoryBinding
import com.example.anniegif.viewmodel.GifViewModel

class CategoryActivity : AppCompatActivity() {

    private val viewModel by viewModels<GifViewModel>()
    private val binding by lazy { ActivityCategoryBinding.inflate(layoutInflater)}
    private val path = arrayListOf("baka", "bite", "blush", "bored", "cry", "cuddle",
        "dance", "facepalm", "feed", "happy", "highfive", "hug", "kiss", "laugh",
        "pat", "poke", "pout", "shrug", "slap", "sleep", "smile", "smug", "stare",
        "think", "thumbsup", "tickle", "wave", "wink")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}