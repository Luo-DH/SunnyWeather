package com.luo.sunnyweather.logic.network

import com.luo.sunnyweather.SunnyWeatherApplication
import com.luo.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author: Luo-DH
 * @date: 5/7/21
 */
interface PlaceService {

    // 搜索城市数据
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}