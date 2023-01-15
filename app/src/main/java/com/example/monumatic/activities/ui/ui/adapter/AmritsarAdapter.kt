package com.example.monumatic.activities.ui.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.models.Monuments

class AmritsarAdapter(private val monuList: ArrayList<Monuments>) :
    RecyclerView.Adapter<AmritsarAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.amritsar_city_attraction_llst_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = monuList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.heading.text= currentItem.heading
        holder.rating.rating = currentItem.rating
    }

    override fun getItemCount(): Int {
        return monuList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleImage: ImageView = itemView.findViewById(R.id.recycler_image)
        val heading: TextView = itemView.findViewById(R.id.recycler_name)
        val rating: RatingBar = itemView.findViewById(R.id.recycler_rating)
    }
}