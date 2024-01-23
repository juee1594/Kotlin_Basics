package com.example.kotlinbasics.apihelper

import com.example.kotlinbasics.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("employees")
    fun getData():Call<DataModel>
}