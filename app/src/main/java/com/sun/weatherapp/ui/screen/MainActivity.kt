package com.sun.weatherapp.ui.screen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sun.weatherapp.R.layout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }
}
