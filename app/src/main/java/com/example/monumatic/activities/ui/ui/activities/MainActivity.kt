package com.example.monumatic.activities.ui.ui.activities


import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.fragments.HomeFragment
import com.example.monumatic.activities.ui.ui.fragments.MyProfileFragment
import com.example.monumatic.activities.ui.ui.fragments.QRScannerFragment
import com.example.monumatic.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

//        Toast.makeText(this, "Welcome To Monumatic", Toast.LENGTH_SHORT).show()

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(HomeFragment())
                R.id.qr_scanner -> replaceFragment(QRScannerFragment())
                R.id.contact_us -> replaceFragment(MyProfileFragment())

                else ->
                {

                }

            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

    }


}