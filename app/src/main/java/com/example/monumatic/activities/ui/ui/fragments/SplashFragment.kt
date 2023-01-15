package com.example.monumatic.activities.ui.ui.fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.monumatic.R

class SplashFragment : Fragment() {


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        WindowManager.LayoutParams.FLAG_FULLSCREEN

        Handler().postDelayed(
            {
                if (onBoardingFinished()) {
                    findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
                } else {
                    findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment2)
                }

            },
            3000
        )

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    private fun onBoardingFinished(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)

    }


}