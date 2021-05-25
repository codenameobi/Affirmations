package com.e.affirmations

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.e.affirmations.adapter.ItemAdapter
import com.e.affirmations.data.Datasource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val horizontalLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)

//        val gridLayoutManager = GridLayoutManager(applicationContext, 3)

        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setLayoutManager(horizontalLayoutManager)
        recyclerView.setHasFixedSize(true)
    }
}