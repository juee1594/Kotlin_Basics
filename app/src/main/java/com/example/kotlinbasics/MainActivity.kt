package com.example.kotlinbasics

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var list: ArrayList<Data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        list = ArrayList()

        val layoutManager = LinearLayoutManager(this)

        val adapter = RecyclerAdapter(list, this)
        recyclerView.layoutManager = layoutManager

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView: TextView = findViewById(R.id.mytextview)
        var timeClicked = 0
        btnClickMe.setOnClickListener {
            timeClicked += 1

            tvMyTextView.text = timeClicked.toString()
            Toast.makeText(this, "Hye Juee!", Toast.LENGTH_SHORT).show()
        }

        val retrofit: Retrofit =
            Retrofit.Builder().baseUrl("https://dummy.restapiexample.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create()).build()

        val api: ApiInterface = retrofit.create(ApiInterface::class.java)

        val call: Call<DataModel> = api.getData()

        call.enqueue(object: Callback<DataModel>{
            @SuppressLint("NotifyDataSetChanged")
            override fun onResponse(
                call: Call<DataModel>,
                response: Response<DataModel>
            ) {
                if(response.isSuccessful){
                    list.clear()
                    Log.e("TAG", "response: "+response.body())
                    for(myData in response.body()?.data!!){

                        list.add(myData)
                    }

                    adapter.notifyDataSetChanged()
                    recyclerView.adapter = adapter
                }
            }

            override fun onFailure(call: Call<DataModel>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_SHORT).show()
                Log.e("TAG", "onFailure: "+t)
            }

        })
    }
}