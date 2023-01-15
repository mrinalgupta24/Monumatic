package com.example.monumatic.activities.ui.ui.activities

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.monumatic.R
import kotlinx.android.synthetic.main.activity_booking_personal_info.*
import kotlinx.android.synthetic.main.activity_booking_personal_info.back_btn
import kotlinx.android.synthetic.main.activity_registration.*
import org.json.JSONException
import java.text.SimpleDateFormat
import java.util.*

class BookingPersonalInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_personal_info)

        back_btn.setOnClickListener {
            val intent = Intent(this, ExploreActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_next.setOnClickListener {
            val intent = Intent(this, BookingPaymentInfoActivity::class.java)
            startActivity(intent)
            finish()
            savedata()
        }


        val myCalendar = Calendar.getInstance()
        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateCalendar(myCalendar)

        }

        dateBtn.setOnClickListener {
            DatePickerDialog(
                this,
                datePicker,
                myCalendar.get(Calendar.YEAR),
                myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)
            ).show()

        }


    }

    private fun savedata() {
        val name= name.text
        val age = age.text
        val phone = phone.text
        val gender =dropdown_gender.text
        val address = address.text
        val country = country.text
        val nationality = dropdown_nationality.text
        val parking = dropdown_parking.text
        val datevisit= dateBtn.text

        val url = "http://192.168.29.228:8080/Android/bookingdetails.php"

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
                    params["Name"] = name.toString()
                    params["Age"] = age.toString()
                    params["Gender"] = gender.toString()
                    params["Phone"] = phone.toString()
                    params["Address"] = address.toString()
                    params["Country"] = country.toString()
                    params["Nationality"] = nationality.toString()
                    params["status"] = parking.toString()
                    params["Datevisit"] = datevisit.toString()
                    
                    return params
                }
            }
        val queue = Volley.newRequestQueue(this)
        queue.add(request)

    }

    private fun updateCalendar(myCalendar: Calendar) {
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        show_dateOfVisit.text = sdf.format(myCalendar.time)
    }

    override fun onResume() {
        super.onResume()
        val gender = resources.getStringArray(R.array.gender)
        val arrayAdapter1 = ArrayAdapter(this, R.layout.dropdown_item, gender)
        dropdown_gender.setAdapter(arrayAdapter1)

        val nationality = resources.getStringArray(R.array.nationality)
        val arrayAdapter2 = ArrayAdapter(this, R.layout.dropdown_item, nationality)
        dropdown_nationality.setAdapter(arrayAdapter2)

        val parking = resources.getStringArray(R.array.parking)
        val arrayAdapter3 = ArrayAdapter(this, R.layout.dropdown_item, parking)
        dropdown_parking.setAdapter(arrayAdapter3)

    }
}