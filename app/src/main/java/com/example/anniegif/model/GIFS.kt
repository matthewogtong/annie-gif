package com.example.anniegif.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GIFS (
    val url: String?,
    val anime_name: String?
    )