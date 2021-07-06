package com.example.mvvmdemo

import android.util.Log
import androidx.lifecycle.LifecycleService

class MyLocationService : LifecycleService {
    constructor(){
        Log.d("ttt","MyLocationService")
        var observer :MyLocationObserver = MyLocationObserver(this)
        lifecycle.addObserver(observer)
    }
}