package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monumatic.R
import kotlinx.android.synthetic.main.activity_see_all_explore_popular_destination.*

class SeeAllExplorePopularDestination : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_see_all_explore_popular_destination)

        back_btn.setOnClickListener {
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)
            finish()
        }

        Punjab.setOnClickListener {
            startActivity(Intent(this, AmritsarInformationActivity::class.java))
        }
        NewDelhi.setOnClickListener {
            startActivity(Intent(this, NewDelhiInformationActivity::class.java))
        }
        UttarPradesh.setOnClickListener {
            startActivity(Intent(this, UttarPradeshInformationActivity::class.java))
        }
        Bengaluru.setOnClickListener {
            startActivity(Intent(this, BengaluruInformationActivity::class.java))
        }
        Maharashtra.setOnClickListener {
            startActivity(Intent(this, MaharashtraInformationActivity::class.java))
        }
        Gujarat.setOnClickListener {
            startActivity(Intent(this, GujaratInformationActivity::class.java))
        }
        WestBengal.setOnClickListener {
            startActivity(Intent(this, WestBengalInformationActivity::class.java))
        }
        Rajasthan.setOnClickListener {
            startActivity(Intent(this, RajasthanInformationActitvity::class.java))
        }
        TamilNadu.setOnClickListener {
            startActivity(Intent(this, TamilNaduInformationActivity::class.java))
        }
        Haryana.setOnClickListener {
            startActivity(Intent(this, HaryanaInformationActivity::class.java))
        }

    }
}