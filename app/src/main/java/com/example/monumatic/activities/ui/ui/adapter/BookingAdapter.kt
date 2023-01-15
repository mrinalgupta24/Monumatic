package com.example.monumatic.activities.ui.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.models.Booking

class BookingAdapter(private val bookingList: ArrayList<Booking>) :
    RecyclerView.Adapter<BookingAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.booking_recyler_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = bookingList[position]
        holder.bookingName.text= currentItem.bookingName
        holder.bookingPrice.text = currentItem.bookingPrice
    }

    override fun getItemCount(): Int {
        return bookingList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val bookingName: TextView = itemView.findViewById(R.id.booking_name)
        val bookingPrice: TextView = itemView.findViewById(R.id.booking_price)
    }
}