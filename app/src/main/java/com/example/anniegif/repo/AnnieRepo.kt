package com.example.anniegif.repo

import com.example.anniegif.model.Categories
import com.example.anniegif.repo.remote.RetrofitInstance
import retrofit2.Response
import java.util.*

object AnnieRepo {
    suspend fun getCategories(): Response <Categories> {
        return RetrofitInstance.annieService.getCategories()
    }

}