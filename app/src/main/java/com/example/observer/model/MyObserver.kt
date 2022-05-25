package com.example.observer.model

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver : LifecycleObserver {

    private val TAG = "MyObserver"

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectListener(){
        Log.d(TAG, "connectListener: ON_RESUME")
    }
    
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disConnectListener(){
        Log.d(TAG, "disConnectListener: ON_PAUSE")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun f1(){
        Log.d(TAG, "connectListener: ON_CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun f2(){
        Log.d(TAG, "disConnectListener: ON_DESTROY")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun f3(){
        Log.d(TAG, "connectListener: ON_START")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun f4(){
        Log.d(TAG, "disConnectListener: ON_STOP")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun f5(){
        Log.d(TAG, "disConnectListener: ON_ANY")
    }
}