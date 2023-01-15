package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monumatic.R
import kotlinx.android.synthetic.main.activity_see_all_explore_famous_monuments.*
import kotlinx.android.synthetic.main.activity_see_all_explore_popular_destination.back_btn

class SeeAllExploreFamousMonuments : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_see_all_explore_famous_monuments)

        back_btn.setOnClickListener {
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)
            finish()
        }

        IndiaGate.setOnClickListener {
            startActivity(Intent(this, IndiaGateActivity::class.java))
        }
        GoldenTemple.setOnClickListener {
            startActivity(Intent(this, GoldenTempleActivity::class.java))
        }
        TajMahal.setOnClickListener {
            startActivity(Intent(this, TajMahalActivity::class.java))
        }
        TipuSultanFort.setOnClickListener {
            startActivity(Intent(this, TipuSultanFortActivity::class.java))
        }
        GatewayOfIndia.setOnClickListener {
            startActivity(Intent(this, GatewayOfIndiaActivity::class.java))
        }
        BuddhistCave.setOnClickListener {
            startActivity(Intent(this, BuddhistCaveActivity::class.java))
        }
        VictoriaMemorial.setOnClickListener {
            startActivity(Intent(this, VictoriaMemorialActivity::class.java))
        }
        HawaMahal.setOnClickListener {
            startActivity(Intent(this, HawaMahalActivity::class.java))
        }
        ArjunChariot.setOnClickListener {
            startActivity(Intent(this, ArjunChariotActivity::class.java))
        }
        StarMonument.setOnClickListener {
            startActivity(Intent(this, StarMonumentActivity::class.java))
        }

    }
}