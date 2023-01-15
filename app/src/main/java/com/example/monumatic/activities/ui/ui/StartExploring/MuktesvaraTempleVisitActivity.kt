package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.BookingPersonalInfoActivity
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*

class MuktesvaraTempleVisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_muktesvara_temple_visit)

        var location =
            "https://www.google.com/maps/place/Sri+Mukteswarar+Temple+Darmasamvarthini+Ambika+Sametha/@10.9051429,76.7995477,7z/data=!4m10!1m2!2m1!1smuktesvara+temple+tamil+nadu!3m6!1s0x3a52fb169ae4a19b:0x6f0d335b54a015e4!8m2!3d12.7345973!4d79.9446364!15sChxtdWt0ZXN2YXJhIHRlbXBsZSB0YW1pbCBuYWR1kgEMaGluZHVfdGVtcGxl4AEA!16s%2Fg%2F1ptwbqyby";

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