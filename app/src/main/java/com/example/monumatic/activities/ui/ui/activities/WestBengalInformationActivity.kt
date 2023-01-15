package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.adapter.WestBengalAdapter
import com.example.monumatic.activities.ui.ui.models.Monuments
import kotlinx.android.synthetic.main.activity_registration.*

class WestBengalInformationActivity : AppCompatActivity() {
    private lateinit var newRecylerview: RecyclerView
    private lateinit var newArrayList: ArrayList<Monuments>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var rating: Array<Float>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_west_bengal_information)

        imageId = arrayOf(
            R.drawable.victoriamemorial,
            R.drawable.marblepalace,
            R.drawable.indianmeuseum,
            R.drawable.hazarduaripalace
        )

        heading = arrayOf(
            "Victoria Memorial",
            "Marble Palace",
            "Indian Museum",
            "Hazarduari Palace"
        )

        rating = arrayOf(
            4.5f,
            4f,
            4.5f,
            3.5f
        )

        newRecylerview = findViewById(R.id.recyclerView)
        newRecylerview.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        newRecylerview.setHasFixedSize(true)
        newArrayList = arrayListOf<Monuments>()
        getUserData()

    }

    private fun getUserData() {
        for (i in imageId.indices) {
            val monuments = Monuments(imageId[i], heading[i], rating[i])
            newArrayList.add(monuments)
        }

        newRecylerview.adapter = WestBengalAdapter(newArrayList)

    }
}