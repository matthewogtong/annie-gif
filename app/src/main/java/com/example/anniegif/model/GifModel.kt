package com.example.anniegif.model

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@JsonClass(generateAdapter = true)
data class GifModel(
    val url: List<GifInfo>
)

@JsonClass(generateAdapter = true)
@Parcelize
data class  GifInfo(
    val url: String,
    @Json(name = "anime_name")
    val anime_name: String
) : Parcelable