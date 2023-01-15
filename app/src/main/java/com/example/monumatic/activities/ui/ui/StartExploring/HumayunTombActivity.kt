package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.BookingPersonalInfoActivity
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*

class HumayunTombActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_humayun_tomb)

        var location = "https://www.google.com/maps/place/Humayun's+Tomb,+Nizamuddin,+Nizamuddin+East,+New+Delhi,+Delhi+110013/@28.5929646,77.2488336,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce31abf23b4d5:0xb20a251215dad3f0!8m2!3d28.5929646!4d77.2510223";
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