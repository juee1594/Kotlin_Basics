package com.example.kotlinbasics.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.kotlinbasics.R
import com.example.kotlinbasics.model.MainViewModelLiveData

class LiveDataExample : AppCompatActivity() {
    lateinit var mainViewModelLiveData: MainViewModelLiveData
    private val factsTextView : TextView
        get() = findViewById(R.id.factsTextView)
    private val btnUpdate : Button
        get() = findViewById(R.id.btnUpdate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_example)

        mainViewModelLiveData = ViewModelProvider(this).get(MainViewModelLiveData::class.java)

        mainViewModelLiveData.factsLiveData.observe(this, Observer {
            factsTextView.text = it
        })

        btnUpdate.setOnClickListener {
            mainViewModelLiveData.updateLiveData()
        }
    }
}