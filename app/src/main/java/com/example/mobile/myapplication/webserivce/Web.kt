package com.example.mobile.myapplication.webserivce

import android.content.Context
import android.util.Log
import com.example.mobile.myapplication.webserivce.Handler.LoginHandler
import com.example.mobile.myapplication.webserivce.model.LogInPrp.LoginPrp
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Mobile on 8/23/2017.
 */

class Web {
    var mInstance: Web? = null
    val api: Api

    internal constructor() {
        mInstance = this
        api = Retrofit.Builder().baseUrl("http://live.csdevhub.com/").addConverterFactory(GsonConverterFactory.create()).build().create(Api::class.java)

    }

    fun getintance(): Web {
        return mInstance!!
    }

    fun login(phoneNumber:String,password:String,handler: LoginHandler) {
        api.login(phoneNumber,password).enqueue(object : Callback<LoginPrp> {
            override fun onResponse(call: Call<LoginPrp>?, response: Response<LoginPrp>?) {
                if (response != null) {
                    Log.e("response is",response.body().toString())
                    handler.onSuccess(response.message())
                }
            }
            override fun onFailure(call: Call<LoginPrp>?, t: Throwable?) {
                Log.e("response is","error")
                handler.onFial("fail")
            }
        })
    }
}
