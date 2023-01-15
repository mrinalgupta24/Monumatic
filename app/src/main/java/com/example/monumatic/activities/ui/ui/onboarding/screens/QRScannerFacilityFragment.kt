package com.example.monumatic.activities.ui.ui.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.viewpager2.widget.ViewPager2
import com.example.monumatic.R
import kotlinx.android.synthetic.main.fragment_about_monumatic.view.*
import kotlinx.android.synthetic.main.fragment_q_r_scanner_facility.view.*
import kotlinx.android.synthetic.main.fragment_view_pager.*


class QRScannerFacilityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        WindowManager.LayoutParams.FLAG_FULLSCREEN
        // Inflate the layout for this fragment
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        val view =  inflater.inflate(R.layout.fragment_q_r_scanner_facility, container, false)

        view.nextFacility2.setOnClickListener {
            viewPager!!.currentItem = 2
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }


}