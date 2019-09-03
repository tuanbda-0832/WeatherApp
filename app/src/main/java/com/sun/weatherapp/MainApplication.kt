package com.sun.weatherapp

import android.app.Application
import com.sun.weatherapp.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Duong Tuan on 03/09/2019.
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MainApplication)
            // declare modules
            modules(appModules)
        }
    }
}