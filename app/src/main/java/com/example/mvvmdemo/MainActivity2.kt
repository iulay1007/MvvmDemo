package com.example.mvvmdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lifecycle_service)
    }

    fun startGps(view: View) {
        startService(Intent(this,MyLocationService::class.java))
    }
    fun stopGps(view: View) {
        stopService(Intent(this,MyLocationService::class.java))
    }
}