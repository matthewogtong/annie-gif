package com.example.anniegif.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.anniegif.model.Url

fun ImageView.loadUrl(url: Url) {
    Glide.with(this).load(url).into(this)
}