package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.monumatic.R
import kotlinx.android.synthetic.main.activity_booking_details.*
import kotlinx.android.synthetic.main.activity_booking_personal_info.*
import kotlinx.android.synthetic.main.activity_booking_personal_info.dropdown_gender
import kotlinx.android.synthetic.main.activity_booking_personal_info.dropdown_nationality
import kotlinx.android.synthetic.main.activity_complete_profile.*
import kotlinx.android.synthetic.main.activity_complete_profile.et_email_address
import kotlinx.android.synthetic.main.activity_complete_profile.et_name
import kotlinx.android.synthetic.main.activity_login_actitvity.*
import kotlinx.android.synthetic.main.activity_registration.*
import org.json.JSONException

class CompleteProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_profile)

        btn_save.setOnClickListener {
            putuserdata()
//            startActivity(Intent(this, MainActivity::class.java))

        }

    }

    private fun putuserdata() {

        val name = et_name.text
        val username = et_username.text
        val dob=et_dob.text
        val aadhar=et_aadhar.text
        val address=et_address.text
        val phone=et_phone.text
        val email=et_email_address.text

        val url = "https://mmonumatic.000webhostapp.com/monumatic.android/profile.php"

        val request: StringRequest =
            object : StringRequest(
                Method.POST, url,
                Response.Listener { response ->
                    try {
                        val obj = (response)
                        val intent = Intent(this, MainActivity::class.java)
                        Toast.makeText(applicationContext, "test $obj", Toast.LENGTH_SHORT).show()
                        startActivity(intent)
                        finish()
                    } catch (e: JSONException) {
                        Toast.makeText(
                            applicationContext,
                            "response,$response",
                            Toast.LENGTH_LONG
                        ).show()
                        e.printStackTrace()
                    }
                },

                Response.ErrorListener { volleyError ->
                    Toast.makeText(
                        applicationContext,
                        "error,$volleyError",
                        Toast.LENGTH_LONG
                    ).show()
                }) {
                @Throws(AuthFailureError::class)
                override fun getParams(): Map<String, String> {
                    val params = HashMap<String, String>()
                    params["Customer_name"] = name.toString()
                    params["Customer_username"] = username.toString()
                    params["Customer_email"]=email.toString()
                    params["Customer_dob"] = dob.toString()
                    params["Customer_phone"] = phone.toString()
                    params["Customer_aadhar"] = aadhar.toString()
                    params["Customer_address"] = address.toString()

                    return params
                }
            }
        val queue = Volley.newRequestQueue(this)
        queue.add(request)
    }
}
