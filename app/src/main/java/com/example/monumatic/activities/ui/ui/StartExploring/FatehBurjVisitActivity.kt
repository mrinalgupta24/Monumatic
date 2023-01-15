package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.BookingPersonalInfoActivity
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*

class FatehBurjVisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fateh_burj_visit)

        var location =
            "https://www.google.com/maps/place/Fateh+Burj+(Baba+Banda+Singh+Bahadur+War+Memorial,+Chappar+Chiri)/@30.7032689,76.665195,17z/data=!3m1!4b1!4m5!3m4!1s0x390fef0b9232f8f9:0xca7958f4f3bc9a22!8m2!3d30.7032689!4d76.6673837";
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