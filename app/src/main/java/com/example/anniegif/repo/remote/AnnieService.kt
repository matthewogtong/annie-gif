package com.example.anniegif.repo.remote

import com.example.anniegif.model.Categories
import com.example.anniegif.model.GIFS
import retrofit2.Response
import retrofit2.http.GET
import java.util.*

interface AnnieService {
    @GET("endpoints")
    suspend fun getCategories(): Response<Categories>

    @GET("baka")
    suspend fun getGIFS(): Response<GIFS>
}