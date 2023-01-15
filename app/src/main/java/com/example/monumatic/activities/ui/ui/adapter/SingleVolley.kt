package com.example.monumatic.activities.ui.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class SingleVolley private constructor(context: Context){
        private var mRequestQueue: RequestQueue?

        init {
            mCtx = context
            mRequestQueue = requestQueue
        }


        val requestQueue: RequestQueue?
            get() {
                if (mRequestQueue == null) {

                    mRequestQueue = Volley.newRequestQueue(mCtx.getApplicationContext())
                }
                return mRequestQueue
            }

        fun <T> addToRequestQueue(req: Request<T>?) {
            requestQueue?.add(req)
        }

        companion object {
            @SuppressLint("StaticFieldLeak")
            private var mInstance: SingleVolley? = null
            @SuppressLint("StaticFieldLeak")
            private lateinit var mCtx: Context
            @Synchronized
            fun getInstance(context: Context): SingleVolley? {
                if (mInstance == null) {
                    mInstance = SingleVolley(context)
                }
                return mInstance
            }
        }
    }
