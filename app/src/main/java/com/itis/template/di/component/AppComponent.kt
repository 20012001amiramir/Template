package com.itis.template.di.component

import android.content.Context
import com.itis.template.api.WeatherService
import com.itis.template.di.module.AppModule
import com.itis.template.di.module.NetModule
import com.itis.template.di.module.ServiceModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetModule::class, ServiceModule::class])
interface AppComponent {

    fun getContext(): Context

    fun getWeatherService(): WeatherService
}
