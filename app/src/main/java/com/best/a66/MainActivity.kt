package com.best.a66

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
        val list = getData()
        refresh(list)
    }

    private fun open() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun refresh(list: ArrayList<User>) {
        val recyclerAdapter = RecyclerAdapter(list)
        recyclerView.adapter = recyclerAdapter
    }

    private fun getData(): ArrayList<User> {
        val list = ArrayList<User>()
        for (i in 1..10) {
            list.add(User("Alisher"))
        }
        return list
    }
}