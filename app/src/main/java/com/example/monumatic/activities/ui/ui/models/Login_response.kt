package com.example.monumatic.activities.ui.ui.models

import retrofit2.Callback

data class Login_response(val error:String, val message:String ) {
    fun enqueue(callback: Callback<Login_response>) {

    }

}

