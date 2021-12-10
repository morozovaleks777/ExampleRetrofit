package com.example.exampleretrofit

import retrofit2.http.GET

interface KanyeApi {
    @GET("/")
    suspend fun getQuote(): QuoteResponse
}