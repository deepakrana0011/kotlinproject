package com.example.mobile.myapplication.webserivce

import com.example.mobile.myapplication.webserivce.model.LogInPrp.LoginPrp
import okhttp3.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Mobile on 8/23/2017.
 */
interface Api {

    @GET("login.php")
    fun login(@Query("phone") artist: String,@Query("password") password: String): retrofit2.Call<LoginPrp>
}