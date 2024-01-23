package com.example.kotlinbasics.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinbasics.Observer
import com.example.kotlinbasics.R

class ObserverExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer_example)
        lifecycle.addObserver(Observer())
        Log.d("Main", "Activity onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main", "Activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main", "Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main", "Activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main", "Activity onDestroy")
    }
}