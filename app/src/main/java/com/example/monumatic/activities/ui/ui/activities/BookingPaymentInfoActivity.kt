package com.example.monumatic.activities.ui.ui.activities
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.widget.Toast
import androidx.core.content.res.TypedArrayUtils.getString
import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.adapter.paymentinfo
import kotlinx.android.synthetic.main.activity_booking_payment_info.*
import kotlinx.android.synthetic.main.activity_booking_personal_info.*
import kotlinx.android.synthetic.main.activity_booking_personal_info.age
import kotlinx.android.synthetic.main.activity_booking_personal_info.back_btn
import kotlinx.android.synthetic.main.activity_booking_personal_info.btn_next
import kotlinx.android.synthetic.main.activity_booking_personal_info.country
import kotlinx.android.synthetic.main.activity_booking_personal_info.phone
import kotlinx.android.synthetic.main.activity_registration.*
import org.json.JSONException
import org.json.JSONObject

class BookingPaymentInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_payment_info)

        back_btn.setOnClickListener {
            val intent = Intent(this, BookingPersonalInfoActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_next.setOnClickListener {
            val intent = Intent(this, BookingConfimedActivity::class.java)
            startActivity(intent)
            finish()
            //paymentfetch()
            //addpaymentdata()
        }

    }

    private fun addpaymentdata() {
        val mname= monumentName.text
        val cardholder=cardHolderName.text
        val cvv=CVV.text
        val cardnumber=cardNumber.text
        val cardexpireDate=expireDate.text

        val url = "http://192.168.29.228:8080/Android/"

        val request: StringRequest =
            object : StringRequest(
                Method.POST, url,
                Response.Listener { response ->
                    try {
                        val obj = (response)
                        Toast.makeText(applicationContext, "test $obj", Toast.LENGTH_SHORT)
                            .show()

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
                    params["Monument_name"] = mname.toString()
                    params["Card_holder_name"] = cardholder.toString()
                    params["CVV"] = cvv.toString()
                    params["Card_number"] = cardnumber.toString()
                    params["Expiration_date"] = cardexpireDate.toString()
                    return params
                }
            }
        val queue = Volley.newRequestQueue(this)
        queue.add(request)

    }

    private fun paymentfetch() {
        val age = age.text
        val phone = phone.text
        val name = pername.text
        val gender =dropdown_gender.text
        val country = country.text
        val nationality = pernationality.text
        val parking = dropdown_parking.text
        val ticket_price=ticketPrice.text
        val bookingDate= bookingDate.text

        val url = "http://192.168.29.228:8080/Android/paymentdetails.php"

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

                            val paymentJson: JSONObject = obj.getJSONObject("paymentinfo")
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
                    params["Age"] =age.toString()
                    params["Phone"] =phone.toString()
                    params["Name"] =name.toString()
                    params["Gender"] =gender.toString()
                    params["Country"] =country.toString()
                    params["Nationality"] =nationality.toString()
                    params["Ticket_price"]=ticketPrice.toString()
                    params["parking_price"] =parking.toString()
                    params["Dateofvisit"] =bookingDate.toString()
                    return params
                }

            }
        val queue = Volley.newRequestQueue(this)
        queue.add(stringRequest)

    }
}