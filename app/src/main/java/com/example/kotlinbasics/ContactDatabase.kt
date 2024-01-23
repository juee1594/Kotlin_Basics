package com.example.kotlinbasics

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlinbasics.model.Contact
import com.example.kotlinbasics.model.ContactDAO

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase() {

    abstract fun contactDao(): ContactDAO
}