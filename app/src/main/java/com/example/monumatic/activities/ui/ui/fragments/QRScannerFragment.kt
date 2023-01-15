package com.example.monumatic.activities.ui.ui.fragments


import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.IntentCompat
import androidx.fragment.app.Fragment
import com.budiyev.android.codescanner.*
import com.example.monumatic.R
import com.example.monumatic.databinding.FragmentQRScannerBinding
import kotlinx.android.synthetic.main.fragment_q_r_scanner.*

private const val CAMERA_REQUEST_CODE = 101

class QRScannerFragment : Fragment() {

    private lateinit var binding: FragmentQRScannerBinding
    private lateinit var codeScanner: CodeScanner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_q_r_scanner, container, false)

        binding = FragmentQRScannerBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupPermission()
        codeScanner()

    }

    private fun codeScanner() {
        scanner_view.apply {
            binding.scannerView.findViewById<CodeScannerView>(R.id.scanner_view)
            codeScanner = CodeScanner(requireActivity(), binding.scannerView)

            codeScanner.camera = CodeScanner.CAMERA_BACK
            codeScanner.formats = CodeScanner.ALL_FORMATS
            codeScanner.autoFocusMode = AutoFocusMode.SAFE
            codeScanner.scanMode = ScanMode.SINGLE
            codeScanner.isAutoFocusEnabled = true
            codeScanner.isFlashEnabled = false

            codeScanner.decodeCallback = DecodeCallback {
                activity?.runOnUiThread(Runnable {
                    Toast.makeText(activity, "Scan result: ${it.text}", Toast.LENGTH_SHORT).show();
//                    val openURL = Intent(Intent.ACTION_VIEW)
//                    openURL.data = Uri.parse("https://${codeScanner}")

                })
            }
            codeScanner.errorCallback = ErrorCallback { // or ErrorCallback.SUPPRESS
                activity?.runOnUiThread {
                    Toast.makeText(
                        activity, "Camera initialization error: ${it.message}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }

            binding.scannerView.setOnClickListener {
                codeScanner.startPreview()
            }

        }

    }

    override fun onResume() {
        super.onResume()
        codeScanner.startPreview()
    }

    override fun onPause() {
        codeScanner.releaseResources()
        super.onPause()
    }

    private fun setupPermission() {
        val permission =
            ContextCompat.checkSelfPermission(requireActivity(), android.Manifest.permission.CAMERA)
        if (permission != PackageManager.PERMISSION_GRANTED) {
            makeRequest()
        }
    }

    private fun makeRequest() {
        ActivityCompat.requestPermissions(
            requireActivity(), arrayOf(android.Manifest.permission.CAMERA),
            CAMERA_REQUEST_CODE
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            CAMERA_REQUEST_CODE -> {
                if (grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(
                        activity,
                        "You need the camera permission to be able to use this app",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(activity, "Successful ", Toast.LENGTH_SHORT).show()

                }
            }
        }
    }
}