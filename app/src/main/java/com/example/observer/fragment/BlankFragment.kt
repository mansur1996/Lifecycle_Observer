package com.example.observer.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.observer.R
import com.example.observer.model.MyObserver

class BlankFragment : Fragment() {

    lateinit var myObserver: MyObserver

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        myObserver = MyObserver()
        viewLifecycleOwner.lifecycle.addObserver(myObserver)

        return inflater.inflate(R.layout.fragment_blank, container, false)
    }
}