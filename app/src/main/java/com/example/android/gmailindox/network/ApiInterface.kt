package com.example.android.gmailindox.network

import info.androidhive.gmail.model.Message
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @get:GET("inbox.json")
    val inbox: Call<List<Message>>

}