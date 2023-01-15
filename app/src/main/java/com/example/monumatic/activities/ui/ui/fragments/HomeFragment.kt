package com.example.monumatic.activities.ui.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.lifecycle.lifecycleScope
import androidx.viewpager2.widget.ViewPager2
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.activities.*
import com.example.monumatic.activities.ui.ui.adapter.ViewPagerAdapter
import com.example.monumatic.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.delay

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)

        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(requireActivity(), "Welcome To Monumatic", Toast.LENGTH_SHORT).show()

        val imageList = listOf(
            R.drawable.taj_mahal,
            R.drawable.the_golden_temple_of_amritsar,
            R.drawable.india_gate,
            R.drawable.gateway_of_india,
            R.drawable.hawa_mahal
        )

        val adapter = ViewPagerAdapter(imageList)
        viewPager.adapter = adapter
        viewPager.autoScroll(lifecycleScope,2000)

        binding.Punjab.setOnClickListener {
            startActivity(Intent(requireActivity(), AmritsarInformationActivity::class.java))
        }
        binding.NewDelhi.setOnClickListener {
            startActivity(Intent(requireActivity(), NewDelhiInformationActivity::class.java))
        }
        binding.Bengaluru.setOnClickListener {
            startActivity(Intent(requireActivity(), BengaluruInformationActivity::class.java))
        }
        binding.Maharashtra.setOnClickListener {
            startActivity(Intent(requireActivity(), MaharashtraInformationActivity::class.java))
        }
        binding.Rajasthan.setOnClickListener {
            startActivity(Intent(requireActivity(), RajasthanInformationActitvity::class.java))
        }
        binding.TamilNadu.setOnClickListener {
            startActivity(Intent(requireActivity(), TamilNaduInformationActivity::class.java))
        }
        binding.textViewexplore.setOnClickListener {
            startActivity(Intent(requireActivity(), ExploreActivity::class.java))
        }
        binding.textViewmap.setOnClickListener {
            startActivity(Intent(requireActivity(),MapsActivity::class.java))
        }
        binding.textViewalltrips.setOnClickListener {
            startActivity(Intent(requireActivity(),AllTripsActivity::class.java))
        }
    }

    fun ViewPager2.autoScroll(lifecycleScope:LifecycleCoroutineScope,interval: Long)
    {
        lifecycleScope.launchWhenResumed{
            scrollIndefinitely(interval)
        }
    }

    private suspend fun ViewPager2.scrollIndefinitely(interval: Long) {
        delay(interval)
        val numberOfItems = adapter?.itemCount ?: 0
        val lastIndex = if (numberOfItems > 0)
            numberOfItems - 1
        else
            0
        val nextItem = if (currentItem == lastIndex) 0
        else
            currentItem + 1

        setCurrentItem(nextItem , true)
        scrollIndefinitely(interval)

    }


}
