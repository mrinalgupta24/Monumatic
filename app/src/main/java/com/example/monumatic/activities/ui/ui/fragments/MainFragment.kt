package com.example.monumatic.activities.ui.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.MainActivity
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val booking = activity?.findViewById<Button>(R.id.startBooking)

        booking!!.setOnClickListener {
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }
    }


}