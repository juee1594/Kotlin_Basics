package com.example.kotlinbasics.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.room.Room
import com.example.kotlinbasics.ContactDatabase
import com.example.kotlinbasics.R
import com.example.kotlinbasics.model.Contact
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SampleRoomDbActivity : AppCompatActivity() {
    lateinit var database: ContactDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_room_db)

        database = Room.databaseBuilder(applicationContext,
        ContactDatabase::class.java,
        "contactDB").build()

        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0, "Juee", "7303069181"))
        }

    }

    fun GetData(view: View) {
        database.contactDao().getContact().observe(this, Observer {
            Log.d("Juee", "GetData: "+it.toString())
        })
    }
}