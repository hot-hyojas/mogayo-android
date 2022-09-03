package com.example.mogayo_android.data.api

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface TempApi {
    @FormUrlEncoded
    @GET("indexProc.do")
    suspend fun getAriNoticeList(): Response<ResponseBody>
}