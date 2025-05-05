package com.pwr.feels.network;


import retrofit2.http.GET;

interface ApiService {

    @GET("/template")
    suspend fun getTemplate(): List<Any>
}
