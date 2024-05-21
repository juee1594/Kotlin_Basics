package com.example.kotlinbasics.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.kotlinbasics.R
import com.example.kotlinbasics.databinding.ActivityDataBindingExampleBinding
import com.example.kotlinbasics.model.Quote

class DataBindingExample : AppCompatActivity() {
    lateinit var binding: ActivityDataBindingExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_example)

        val quoteObj = Quote("Do, or do not. There is no try.", "Yoda")
        binding.quote = quoteObj
    }
}