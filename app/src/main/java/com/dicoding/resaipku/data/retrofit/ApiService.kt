package com.dicoding.resaipku.data.retrofit

import com.dicoding.resaipku.data.response.DataItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("recipe/{id}")
    fun getRecipe(
        @Path("recipe") id: String
    ): Call<DataItem>
}