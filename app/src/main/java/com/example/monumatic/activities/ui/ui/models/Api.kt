package com.example.monumatic.activities.ui.ui.models

import retrofit2.Call
import retrofit2.http.*

interface Api {
    @FormUrlEncoded
    @GET("loginuser.php")
    fun userLogin(
        @Field("Customer_email") email:String,
        @Field("Customer_password") password: String
    ): Call<Login_response>
    @FormUrlEncoded
    @GET("payment.php")

    fun paymentuser(
        @Field(" Monument_id") id:String,
        @Field("Monument_name") name: String,
        @Field("Monument_location") location:String,
        @Field("Monument_city") city: String,
        @Field("Monument_timming") timming:String,
        @Field("Monument_entry") entry: String,
        @Field("Moument_closed") closedtails:String,
        @Field("Moument_status") status: String,
        @Field("ticket_indain") c_indian:String,
        @Field("ticket_nri") c_nri: String,
    ):Call<payment_response>

}