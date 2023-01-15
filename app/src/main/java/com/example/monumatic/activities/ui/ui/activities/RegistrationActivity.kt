package com.example.monumatic.activities.ui.ui.activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.monumatic.R
import kotlinx.android.synthetic.main.activity_registration.*
import org.json.JSONException

class RegistrationActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        tv_login.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_register.setOnClickListener {
            validateRegisterDetails()
        }

        back_btn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
    private fun registeruser() {
        val name = et_name.text
        val email = et_email_address.text
        val password = et_password.text


        val url = "https://mmonumatic.000webhostapp.com/monumatic.android/newsignuppage.php"

        val request: StringRequest =
            object : StringRequest(
                Method.POST, url,
                Response.Listener { response ->
                    try {
                        val obj = (response)
                        val intent = Intent(this, LoginActivity::class.java)
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
                    params["Customer_email"] = email.toString()
                    params["Customer_password"] = password.toString()

                    return params
                }
            }
        val queue = Volley.newRequestQueue(this)
        queue.add(request)
    }

    private fun validateRegisterDetails(): Boolean {
        return when {
            TextUtils.isEmpty(et_name.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_first_name), true)
                false
            }

            TextUtils.isEmpty(et_email_address.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_email), true)
                false
            }

            TextUtils.isEmpty(et_password.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar(resources.getString(R.string.err_msg_enter_password), true)
                false
            }

            TextUtils.isEmpty(et_confirm_password.text.toString().trim { it <= ' ' }) -> {
                showErrorSnackBar(
                    resources.getString(R.string.err_msg_enter_confirm_password),
                    true
                )
                false
            }

            et_password.text.toString().trim { it <= ' ' } != et_confirm_password.text.toString()
                .trim { it <= ' ' } -> {
                showErrorSnackBar(
                    resources.getString(R.string.err_msg_password_and_confirm_password_mismatch),
                    true
                )
                false
            }
            else -> {
                showErrorSnackBar(
                    resources.getString(R.string.success_registration),
                    false
                )
                registeruser()
                true
            }
        }
    }
}