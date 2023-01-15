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
import kotlinx.android.synthetic.main.fragment_view_pager.*

class AboutMonumaticFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        WindowManager.LayoutParams.FLAG_FULLSCREEN
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        val view =  inflater.inflate(R.layout.fragment_about_monumatic, container, false)

        view.nextFacility1.setOnClickListener {
            viewPager!!.currentItem = 1
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

}