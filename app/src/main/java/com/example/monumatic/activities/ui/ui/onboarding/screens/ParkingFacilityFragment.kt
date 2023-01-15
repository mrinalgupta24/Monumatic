package com.example.monumatic.activities.ui.ui.onboarding.screens

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.monumatic.R
import kotlinx.android.synthetic.main.fragment_parking_facility.view.*

class ParkingFacilityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        WindowManager.LayoutParams.FLAG_FULLSCREEN

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_parking_facility, container, false)

        view.nextFacility3.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment2_to_mainFragment)
            onBoardingFinished()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

}