package com.example.monumatic.activities.ui.ui.activities.StartExploring

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.BookingPersonalInfoActivity
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*
import kotlinx.android.synthetic.main.activity_india_gate_visit.*
import kotlinx.android.synthetic.main.activity_qutab_minar_visit.*

class IndiaGateVisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_india_gate_visit)

        var location =
                "https://www.google.com/maps/place/India+Gate/@28.612912,77.227321,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce2daa9eb4d0b:0x717971125923e5d!8m2!3d28.612912!4d77.2295097";
        citydetails_getlocationbtnIndiaGate.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(location)
                )
            )
        })

        var send = "https://monumatic-web.000webhostapp.com/login.html"
        citydetails_bookTicketbtnIndiaGate.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(send)
                )
            )
        })


    }
}