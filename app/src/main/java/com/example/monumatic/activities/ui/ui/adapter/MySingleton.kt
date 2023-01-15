package com.example.monumatic.activities.ui.ui.adapter

import android.annotation.SuppressLint
import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class MySingleton(context: Context?) {
    private var mRequestQueue: RequestQueue? = null
    @SuppressLint("NotConstructor")
    private fun MySingleton(context: Context) {
        mCtx = context
        mRequestQueue = requestQueue
    }

    // getApplicationContext() is key, it keeps you from leaking the
    // Activity or BroadcastReceiver if someone passes one in.
    private val requestQueue: RequestQueue?
        private get() {
            if (mRequestQueue == null) {
                // getApplicationContext() is key, it keeps you from leaking the
                // Activity or BroadcastReceiver if someone passes one in.
                mRequestQueue = Volley.newRequestQueue(mCtx?.getApplicationContext())
            }
            return mRequestQueue
        }

    fun <T> addToRequestQueue(req: Request<T>?) {
        requestQueue?.add(req)
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        private var mInstance: MySingleton? = null
        @SuppressLint("StaticFieldLeak")
        private var mCtx: Context? = null
        @Synchronized
        fun getInstance(context: Context?): MySingleton? {
            if (mInstance == null) {
                mInstance = MySingleton(context)
            }
            return mInstance
        }
    }
}
