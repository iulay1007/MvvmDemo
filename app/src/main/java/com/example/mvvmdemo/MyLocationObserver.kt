package com.example.mvvmdemo

import android.content.Context
import android.location.LocationManager
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyLocationObserver(var context: Context) :LifecycleObserver {
        lateinit var locationManager:LocationManager

        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        fun startGetLocation(){
           locationManager  = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        //TODO:
        // locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,3000,1)
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        fun stopGetLocation(){


        }
}