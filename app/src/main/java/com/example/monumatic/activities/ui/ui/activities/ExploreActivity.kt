package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.StartExploring.TouristAttractionsActivity
import com.example.monumatic.activities.ui.ui.adapter.ExploreFamousMonuments
import com.example.monumatic.activities.ui.ui.adapter.ExploreTopDestination
import com.example.monumatic.activities.ui.ui.models.ExploreFamousMonumentsModel
import com.example.monumatic.activities.ui.ui.models.ExploreTopDestinationModel
import kotlinx.android.synthetic.main.activity_explore.*

class ExploreActivity : AppCompatActivity() {

    private lateinit var TouristDestinationRecylerview: RecyclerView
    private lateinit var newArrayList1: ArrayList<ExploreTopDestinationModel>
    lateinit var imageId: Array<Int>
    lateinit var cityName: Array<String>
    lateinit var stateName: Array<String>

    private lateinit var FamousMonumentsRecylerview: RecyclerView
    private lateinit var newArrayList2: ArrayList<ExploreFamousMonumentsModel>
    lateinit var monumentImage: Array<Int>
    lateinit var monumentName: Array<String>
    lateinit var monumentState: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        imageId = arrayOf(
            R.drawable.india_gate,
            R.drawable.the_golden_temple_of_amritsar,
            R.drawable.taj_mahal,
            R.drawable.gateway_of_india,
            R.drawable.rajasthan,
        )

        cityName = arrayOf(
            "New Delhi",
            "Amritsar",
            "Agra",
            "Maharashtra",
            "Jaipur"
        )

        stateName = arrayOf(
            "Delhi",
            "Punjab",
            "Uttar Pradesh",
            "Mumbai",
            "Rajasthan"
        )

        monumentImage = arrayOf(
            R.drawable.india_gate,
            R.drawable.the_golden_temple_of_amritsar,
            R.drawable.taj_mahal,
            R.drawable.gateway_of_india,
            R.drawable.hawa_mahal,
        )

        monumentName = arrayOf(
            "India Gate",
            "Golden Temple",
            "Taj Mahal",
            "Gateway Of India",
            "Hawa Mahal"
        )

        monumentState = arrayOf(
            "Delhi",
            "Punjab",
            "Uttar Pradesh",
            "Mumbai",
            "Rajasthan"
        )

        TouristDestinationRecylerview = findViewById(R.id.touristdestinations_recyclerview)
        TouristDestinationRecylerview.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        TouristDestinationRecylerview.setHasFixedSize(true)
        newArrayList1 = arrayListOf<ExploreTopDestinationModel>()
        getUserData1()

        FamousMonumentsRecylerview = findViewById(R.id.touristattractions_recyclerview)
        FamousMonumentsRecylerview.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        FamousMonumentsRecylerview.setHasFixedSize(true)
        newArrayList2 = arrayListOf<ExploreFamousMonumentsModel>()
        getUserData2()


       seetouristdestinations_link.setOnClickListener {
           startActivity(Intent(this, SeeAllExplorePopularDestination::class.java))
       }

        seetouristattractions_link.setOnClickListener {
            startActivity(Intent(this, SeeAllExploreFamousMonuments::class.java))
        }

        exploretouristdestinations_button.setOnClickListener {
            startActivity(Intent(this, TouristAttractionsActivity::class.java))
        }
    }

    private fun getUserData2() {
        for (i in monumentImage.indices) {
            val exploretm = ExploreFamousMonumentsModel(monumentImage[i],monumentName[i],monumentState[i])
            newArrayList2.add(exploretm)
        }

        FamousMonumentsRecylerview.adapter = ExploreFamousMonuments(newArrayList2)
    }

    private fun getUserData1() {
        for (i in imageId.indices) {
            val exploretd = ExploreTopDestinationModel(imageId[i], cityName[i],stateName[i])
            newArrayList1.add(exploretd)
        }

        TouristDestinationRecylerview.adapter = ExploreTopDestination(newArrayList1)

    }
}