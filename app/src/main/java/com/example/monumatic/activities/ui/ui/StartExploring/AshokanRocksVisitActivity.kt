package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.BookingPersonalInfoActivity
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*

class AshokanRocksVisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ashokan_rocks_visit)

        var location =
            "https://www.google.com/maps/place/Ashoka+Rock+Edict,+Saru+Maru/@21.6206484,71.7550883,7z/data=!4m10!1m2!2m1!1sAshokanRocks+gUJRAT!3m6!1s0x397db7ea438d5cb7:0xbbe435c61e824e36!8m2!3d22.7300223!4d77.5194837!15sChRBc2hva2FuIFJvY2sgZ1VKQVJBVJIBE2hpc3RvcmljYWxfbGFuZG1hcmvgAQA!16s%2Fg%2F11s30q4lyd";

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