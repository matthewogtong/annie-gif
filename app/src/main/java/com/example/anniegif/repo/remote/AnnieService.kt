package com.example.anniegif.repo.remote

import com.example.anniegif.model.Categories
import com.example.anniegif.model.Gifs
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface AnnieService {
//    @GET("endpoints")
//    suspend fun getCategories(): Response<Categories>

    @GET("{category}")
    suspend fun getGifs(
        @Path("category") id: String,
        @Query("amount") amount: Int
    ): Response<Gifs>
}