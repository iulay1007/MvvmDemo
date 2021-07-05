package com.example.mvvmdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {
    private lateinit var chronometer : MyChronometer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lifecycle)
        chronometer = findViewById(R.id.chronometer)
        lifecycle.addObserver(chronometer)

    }
}