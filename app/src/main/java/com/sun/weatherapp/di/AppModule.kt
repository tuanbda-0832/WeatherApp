package com.sun.weatherapp.di

import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

/**
 * Created by Duong Tuan on 03/09/2019.
 */

val appModule = module {
    // inject resources for viewmodel =))
    single { androidApplication().resources }
}

val appModules = listOf(appModule, networkModule, viewModelModule)