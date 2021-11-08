package com.example.anniegif.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Categories(
    val baka: CategoryInfo,
    val bite: CategoryInfo,
    val blush: CategoryInfo,
    val bored: CategoryInfo,
    val cry: CategoryInfo,
    val cuddle: CategoryInfo,
    val dance: CategoryInfo,
    val facepalm: CategoryInfo,
    val feed: CategoryInfo,
    val happy: CategoryInfo,
    val highfive: CategoryInfo,
    val hug: CategoryInfo,
    val kiss: CategoryInfo,
    val laugh: CategoryInfo,
    val nekos: CategoryInfo,
    val pat: CategoryInfo,
    val poke: CategoryInfo,
    val pout: CategoryInfo,
    val shrug: CategoryInfo,
    val slap: CategoryInfo,
    val sleep: CategoryInfo,
    val smile: CategoryInfo,
    val smug: CategoryInfo,
    val stare: CategoryInfo,
    val think: CategoryInfo,
    val thumbsup: CategoryInfo,
    val tickle: CategoryInfo,
    val wave: CategoryInfo,
    val wink: CategoryInfo
) {
    @JsonClass(generateAdapter = true)
    data class CategoryInfo(
        val min: String?,
        val max: String?,
        val format: String?
    )
}

