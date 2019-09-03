package com.sun.weatherapp.di

import com.sun.weatherapp.data.repository.MainRepository
import com.sun.weatherapp.data.repository.impl.MainRepositoryImpl
import org.koin.dsl.module

/**
 * Created by Duong Tuan on 03/09/2019.
 */

val repositoryModule = module {
    single<MainRepository> { MainRepositoryImpl() }
}