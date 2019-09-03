package com.sun.weatherapp.ui.screen.main

import android.content.res.Resources
import androidx.lifecycle.ViewModel
import com.sun.weatherapp.data.repository.MainRepository

/**
 * Created by Duong Tuan on 03/09/2019.
 */
class MainViewModel(
    val resources: Resources,
    val mainRepository: MainRepository
) : ViewModel()