package com.example.anniegif.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

}