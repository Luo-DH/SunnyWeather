package com.luo.sunnyweather

import android.app.Application
import android.content.Context
import android.content.res.Configuration

/**
 * @author: Luo-DH
 * @date: 5/7/21
 */
class SunnyWeatherApplication : Application() {

    companion object {
        // 填入申请到的令牌值，方便全局获取
        const val TOKEN = ""
        lateinit var context: Context
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        context = applicationContext
    }

}