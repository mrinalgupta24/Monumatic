package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.ExploreActivity
import com.example.monumatic.activities.ui.ui.adapter.TouristAttractionAdapter
import com.example.monumatic.activities.ui.ui.models.TouristAttractionModel
import kotlinx.android.synthetic.main.activity_registration.*

class TouristAttractionsActivity : AppCompatActivity() {
    private lateinit var newRecylerview: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourist_attractions)

        val arrayList = ArrayList<TouristAttractionModel>()

        arrayList.add(TouristAttractionModel(R.drawable.india_gate,"India Gate","New Delhi"))
        arrayList.add(TouristAttractionModel(R.drawable.qutab_minar,"Qutab Minar","New Delhi"))
        arrayList.add(TouristAttractionModel(R.drawable.akshardham,"Akshardham Temple","New Delhi"))
        arrayList.add(TouristAttractionModel(R.drawable.humayun,"Humayun Tomb","New Delhi"))

        arrayList.add(TouristAttractionModel(R.drawable.the_golden_temple_of_amritsar,"Golden Temple","Punjab"))
        arrayList.add(TouristAttractionModel(R.drawable.jallianwala_bagh,"Jallianwala Bagh","Punjab"))
        arrayList.add(TouristAttractionModel(R.drawable.quila_mubarak,"Quila Mubarak","Punjab"))
        arrayList.add(TouristAttractionModel(R.drawable.fateh_burj,"Fateh Burj","Punjab"))

        arrayList.add(TouristAttractionModel(R.drawable.taj_mahal,"Taj Mahal","Uttar Pradesh"))
        arrayList.add(TouristAttractionModel(R.drawable.agrafort,"Agra Fort","Uttar Pradesh"))
        arrayList.add(TouristAttractionModel(R.drawable.fatehpursikri,"Fatehpur Sikri","Uttar Pradesh"))
        arrayList.add(TouristAttractionModel(R.drawable.akbarstomb,"Akbar Tomb","Uttar Pradesh"))

        arrayList.add(TouristAttractionModel(R.drawable.tipusultanfort,"Tipu Sultan Fort","Bengaluru"))
        arrayList.add(TouristAttractionModel(R.drawable.banglorefort,"Bangalore Fort","Bengaluru"))
        arrayList.add(TouristAttractionModel(R.drawable.banglorepalace,"Bangalore Palace","Bengaluru"))
        arrayList.add(TouristAttractionModel(R.drawable.lalbaghbotanicalgarden,"Lalbagh Garden","Bengaluru"))

        arrayList.add(TouristAttractionModel(R.drawable.gateway_of_india,"Gateway Of India","Maharashtra"))
        arrayList.add(TouristAttractionModel(R.drawable.ajanta_caves,"Ajanta Caves","Maharashtra"))
        arrayList.add(TouristAttractionModel(R.drawable.shivaji_maharaj,"Shivaji Vastu","Maharashtra"))
        arrayList.add(TouristAttractionModel(R.drawable.elloracaves,"Ellora Caves","Maharashtra"))

        arrayList.add(TouristAttractionModel(R.drawable.buddhist_caves,"Buddhist Caves","Gujarat"))
        arrayList.add(TouristAttractionModel(R.drawable.ashokanrock,"Ashokan Rocks","Gujarat"))
        arrayList.add(TouristAttractionModel(R.drawable.ranikivav,"Rani-Ki-Vav","Gujarat"))
        arrayList.add(TouristAttractionModel(R.drawable.suntemple,"Sun Temple","Gujarat"))

        arrayList.add(TouristAttractionModel(R.drawable.victoriamemorial,"Victoria Memorial","West Bengal"))
        arrayList.add(TouristAttractionModel(R.drawable.marblepalace,"Marble Palace","West Bengal"))
        arrayList.add(TouristAttractionModel(R.drawable.indianmeuseum,"Indian Museum","West Bengal"))
        arrayList.add(TouristAttractionModel(R.drawable.hazarduaripalace,"Hazarduari Palace","West Bengal"))

        arrayList.add(TouristAttractionModel(R.drawable.chittorgarh_fort,"Chittorgarh Fort","Rajasthan"))
        arrayList.add(TouristAttractionModel(R.drawable.hawa_mahal,"Hawa Mahal","Rajasthan"))
        arrayList.add(TouristAttractionModel(R.drawable.mehangarhfort,"Mehrangarh Fort","Rajasthan"))
        arrayList.add(TouristAttractionModel(R.drawable.jaisalmer_fort,"Jaisalmer Fort","Rajasthan"))

        arrayList.add(TouristAttractionModel(R.drawable.dharamrajarath,"Yudhishthra's Chariot","Tamil Nadu"))
        arrayList.add(TouristAttractionModel(R.drawable.valluvarkottalam,"Valluvar Kottam","Tamil Nadu"))
        arrayList.add(TouristAttractionModel(R.drawable.arjunchariot,"Arjun Chariot","Tamil Nadu"))
        arrayList.add(TouristAttractionModel(R.drawable.muktesvaratemple,"Muktesvara Temple","Tamil Nadu"))

        arrayList.add(TouristAttractionModel(R.drawable.surajkund,"Surajkund","Haryana"))
        arrayList.add(TouristAttractionModel(R.drawable.lakarpurshiekh,"Lakarpur Tomb","Haryana"))
        arrayList.add(TouristAttractionModel(R.drawable.starmonument,"Star Monument","Haryana"))
        arrayList.add(TouristAttractionModel(R.drawable.qutubkhantomb,"Qutub Khan Tomb","Haryana"))

        val myAdapter = TouristAttractionAdapter(arrayList,this)
        newRecylerview = findViewById(R.id.tourattr_recycler)
        newRecylerview.layoutManager = LinearLayoutManager(this)
        newRecylerview.setHasFixedSize(true)
        newRecylerview.adapter = myAdapter

        back_btn.setOnClickListener {
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}