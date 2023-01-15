package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.android.volley.*
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.monumatic.R
import kotlinx.android.synthetic.main.activity_booking_personal_info.*
import kotlinx.android.synthetic.main.activity_login_actitvity.*
import kotlinx.android.synthetic.main.activity_registration.*
import org.json.JSONException


open class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_actitvity)

        tv_forgot_password.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
            finish()
        }


        tv_register.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_login.setOnClickListener {
            validateLoginDetails()
        }

    }


    private fun login() {
        val email = et_email.text
        val password = et_pass.text
        val url = "https://mmonumatic.000webhostapp.com/monumatic.android/newloginpage.php"

        val request: StringRequest =
            object : StringRequest(
                Method.POST, url,
                Response.Listener { response ->
                    try {
                        val obj = (response)
                        val intent = Intent(this, CompleteProfileActivity::class.java)
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
                    params["Customer_email"] = email.toString()
                    params["Customer_password"] = password.toString()
                    return params
                }
            }
        val queue = Volley.newRequestQueue(this)
        queue.add(request)
    }

    private fun validateLoginDetails(): Boolean {
        return when {

            TextUtils.isEmpty(et_email.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_email), true)
                false
            }

            TextUtils.isEmpty(et_pass.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_password), true)
                false
            }

            else -> {
                showErrorSnackBar(
                    resources.getString(R.string.success_login),
                    false
                )
                login()
                true
            }
        }

    }
}
