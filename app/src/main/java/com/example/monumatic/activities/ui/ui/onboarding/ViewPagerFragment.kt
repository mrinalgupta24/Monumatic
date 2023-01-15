package com.example.monumatic.activities.ui.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.onboarding.screens.AboutMonumaticFragment
import com.example.monumatic.activities.ui.ui.onboarding.screens.ParkingFacilityFragment
import com.example.monumatic.activities.ui.ui.onboarding.screens.QRScannerFacilityFragment
import kotlinx.android.synthetic.main.fragment_view_pager.*
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            AboutMonumaticFragment(),
            QRScannerFacilityFragment(),
            ParkingFacilityFragment()

        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.viewPager2.adapter = adapter


        return view
    }
}
