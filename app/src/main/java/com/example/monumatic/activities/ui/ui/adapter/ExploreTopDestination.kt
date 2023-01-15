package com.example.monumatic.activities.ui.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.models.ExploreTopDestinationModel

class ExploreTopDestination(private val exploreTD: ArrayList<ExploreTopDestinationModel>) :
    RecyclerView.Adapter<ExploreTopDestination.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.explore_top_destination_recycler_view, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = exploreTD[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.cityName.text= currentItem.cityName
        holder.stateName.text = currentItem.stateName;
    }

    override fun getItemCount(): Int {
        return exploreTD.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleImage: ImageView = itemView.findViewById(R.id.city_image)
        val cityName: TextView = itemView.findViewById(R.id.city_name)
        val stateName: TextView = itemView.findViewById(R.id.state_name)
    }
}