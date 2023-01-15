package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.adapter.MaharashtraAdapter
import com.example.monumatic.activities.ui.ui.models.Monuments
import kotlinx.android.synthetic.main.activity_registration.*

class MaharashtraInformationActivity : AppCompatActivity() {
    private lateinit var newRecylerview: RecyclerView
    private lateinit var newArrayList: ArrayList<Monuments>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>
    lateinit var rating: Array<Float>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maharashtra_information)

        imageId = arrayOf(
            R.drawable.gateway_of_india,
            R.drawable.ajanta_caves,
            R.drawable.shivaji_maharaj,
            R.drawable.elloracaves
        )

        heading = arrayOf(
            "Gateway Of India",
            "Ajanta Caves",
            "Shivaji Maharaj Vastu",
            "Ellora Caves"
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

        newRecylerview.adapter = MaharashtraAdapter(newArrayList)

    }
}