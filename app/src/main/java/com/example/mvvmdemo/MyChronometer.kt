package com.example.mvvmdemo

import android.app.Application
import android.content.Context
import android.os.SystemClock
import android.util.AttributeSet
import android.widget.Chronometer
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyChronometer : Chronometer,LifecycleObserver{

     var elapsedTime : Long = 0;

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attributeSet: AttributeSet?) : this(context, attributeSet, 0)
    constructor(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int) : super(context, attributeSet, defStyleAttr) {
      //  init(context, attributeSet)
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun startMeter(){
        setBase(SystemClock.elapsedRealtime() - elapsedTime);
        start();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun stopMeter(){
        elapsedTime = SystemClock.elapsedRealtime() - getBase();
        stop();
    }
}