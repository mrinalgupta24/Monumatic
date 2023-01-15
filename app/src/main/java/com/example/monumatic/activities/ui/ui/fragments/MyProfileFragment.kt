package com.example.monumatic.activities.ui.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.monumatic.databinding.FragmentMyProfileBinding
import kotlinx.android.synthetic.main.activity_agra_fort_visit.*

class MyProfileFragment : Fragment() {

    private lateinit var binding: FragmentMyProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_my_profile, container, false)

        binding = FragmentMyProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var help =
            "https://shubham-monumatic.000webhostapp.com/MonumaticHelpdesk/ ";

        binding.btnNeedHelp.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(help)
                )
            )
        })

        var location =
            "https://www.google.com/maps/place/Jagannath+International+Management+School+(JIMS)+Vasant+Kunj/@28.5287221,77.1455165,17z/data=!3m1!4b1!4m5!3m4!1s0x390d1d00e93feae5:0xbdbecebed2e17592!8m2!3d28.5287192!4d77.1499782"

        binding.tvAddressDetails.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(location)
                )
            )
        })
    }

}