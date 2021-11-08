package com.example.anniegif.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true)
@Parcelize
data class Gifs (
    val url: String?,
    @Json(name = "anime_name") val animeName: String?
    ) : Parcelable