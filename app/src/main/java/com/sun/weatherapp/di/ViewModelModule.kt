package com.sun.weatherapp.di

import com.sun.weatherapp.ui.screen.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Created by Duong Tuan on 03/09/2019.
 */

val viewModelModule: Module = module {
    viewModel { MainViewModel(get(), get()) }
}

