package com.example.retrofit

import Todo
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>

}