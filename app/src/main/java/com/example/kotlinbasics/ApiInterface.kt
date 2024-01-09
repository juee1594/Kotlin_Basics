package com.example.kotlinbasics

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("employees")
    fun getData():Call<DataModel>
}