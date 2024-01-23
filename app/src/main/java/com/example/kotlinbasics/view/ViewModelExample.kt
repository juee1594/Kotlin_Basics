package com.example.kotlinbasics.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinbasics.R
import com.example.kotlinbasics.model.MainViewModel

class ViewModelExample : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    lateinit var txtCounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model_example)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        txtCounter = findViewById(R.id.mytextview)

        setText()
    }

    fun setText() {
        txtCounter.text = mainViewModel.count.toString()
    }

    fun increment(view: View){
        mainViewModel.increment()
        setText()
    }
}