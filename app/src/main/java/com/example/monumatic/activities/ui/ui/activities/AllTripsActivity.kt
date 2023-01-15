package com.example.monumatic.activities.ui.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.adapter.AmritsarAdapter
import com.example.monumatic.activities.ui.ui.models.Booking
import com.example.monumatic.activities.ui.ui.models.Monuments

class AllTripsActivity : AppCompatActivity() {

    private lateinit var newRecylerview: RecyclerView
    private lateinit var newArrayList: ArrayList<Booking>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_trips)

    }
}