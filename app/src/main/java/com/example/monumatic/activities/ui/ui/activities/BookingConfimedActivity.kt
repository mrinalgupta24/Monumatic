package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monumatic.R
import kotlinx.android.synthetic.main.activity_booking_confimed.*
import kotlinx.android.synthetic.main.activity_booking_personal_info.*

class BookingConfimedActivity : AppCompatActivity() {
    lateinit var bitmap: Bitmap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_confimed)

        continue_travel.setOnClickListener {
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}