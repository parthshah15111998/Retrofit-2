package com.example.retrofit2

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface RetrofitAPI {


    @POST("users")
    fun createPost(@Body dataModal: DataModal?): Call<DataModal?>?
}
