package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.BookingPersonalInfoActivity
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*

class FatehpurSikriVisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fatehpur_sikri_visit)

        var location =
            "https://www.google.com/maps/place/Fatehpur+Sikri+Fort/@27.0966511,77.6640547,17z/data=!3m1!4b1!4m5!3m4!1s0x397393fd030fffff:0x75aefa4abef7bb0c!8m2!3d27.0966511!4d77.6662434";
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