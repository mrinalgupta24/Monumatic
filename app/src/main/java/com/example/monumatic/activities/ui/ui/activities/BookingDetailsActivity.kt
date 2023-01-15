package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.monumatic.R
import kotlinx.android.synthetic.main.activity_booking_details.*

class BookingDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_details)

        back_btn.setOnClickListener {
            startActivity(Intent(this, AllTripsActivity::class.java))
           // ticket()
        }

    }
    /*Private fun ticket(){
        val date = book_date.text
        val name  = holdername.text
        val mname = m_name.text
        val status = status.text
        val parking_price = parking_price.text
        val total_price = total_price.text
        val ticket_price = ticket_price.text


        val url = "http://192.168.29.228:8080/Android/newloginpage.php"

        val stringRequest: StringRequest =
            object : StringRequest(
                Method.GET, url,
                Response.Listener { response ->
                    try {

                        val obj = JSONObject(response.toString())

                        if (!obj.getBoolean("error")) {
                            Toast.makeText(
                                applicationContext,
                                obj.getString("message"),
                                Toast.LENGTH_LONG
                            ).show()

                            val userJson: JSONObject = obj.getJSONObject("user")

                            val user = User(
                                userJson.getString("Customer_email"),
                                userJson.getString("Customer_password")
                            )

                            SharedPrefManager.getInstance(applicationContext)!!
                                .userLogin(user)

                            finish()
                            startActivity(
                                Intent(
                                    applicationContext,
                                    MainActivity::class.java
                                )
                            )
                        } else {
                            Toast.makeText(
                                applicationContext,
                                obj.getString("message"),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                },
                Response.ErrorListener { volleyError ->
                    println(volleyError.toString())
                    Toast.makeText(
                        applicationContext,
                        "error,$volleyError",
                        Toast.LENGTH_LONG
                    ).show()

                }) {
                @Throws(AuthFailureError::class)
                //protected val param: Map<String, String>
                override fun getParams(): Map<String, String> {
                    val params = HashMap<String, String>()
                    params[""] = date
                    params[""] = name
                    params[""] = mname
                    params[""] = status
                    params[""] = parking_price
                    params[""] = ticket_price
                    params[""] = total_price
                    return params
                }

            }
        val queue = Volley.newRequestQueue(this)
        queue.add(stringRequest)
    }*/

}