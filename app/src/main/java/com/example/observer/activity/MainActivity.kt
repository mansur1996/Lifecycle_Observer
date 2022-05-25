package com.example.observer.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.observer.R
import com.example.observer.model.MyObserver

class MainActivity : AppCompatActivity() {
    lateinit var myObserver: MyObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myObserver = MyObserver()
        initViews()
    }

    private fun initViews() {
        this.lifecycle.addObserver(myObserver)
    }
}