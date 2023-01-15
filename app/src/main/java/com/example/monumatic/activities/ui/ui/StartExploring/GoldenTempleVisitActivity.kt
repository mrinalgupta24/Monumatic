package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.BookingPersonalInfoActivity
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*

class GoldenTempleVisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_golden_temple_visit)

        var location =
            "https://www.google.com/maps/place/Sri+Harmandir+Sahib/@31.6199803,74.8742962,17z/data=!3m1!4b1!4m5!3m4!1s0x39197ca8f667bd97:0x604384897626248e!8m2!3d31.6199803!4d74.8764849";

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