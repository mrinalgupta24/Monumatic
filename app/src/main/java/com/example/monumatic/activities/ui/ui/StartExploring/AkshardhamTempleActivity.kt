package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.BookingPersonalInfoActivity
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*

class AkshardhamTempleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akshardham_temple)

        var location =
            "https://www.google.com/maps/search/akshardham+temple/@28.5649094,77.144738,12z/data=!3m1!4b1";

        citydetails_getlocationbtn.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(location)
                )
            )
        })

        var send = "https://monumatic-web.000webhostapp.com/login.html"
        citydetails_bookTicketbtn.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(send)
                )
            )
        })

    }
}