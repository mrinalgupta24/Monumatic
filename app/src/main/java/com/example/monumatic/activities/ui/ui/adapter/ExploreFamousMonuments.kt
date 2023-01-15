package com.example.monumatic.activities.ui.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.monumatic.R
import com.example.monumatic.activities.ui.ui.models.ExploreFamousMonumentsModel

class ExploreFamousMonuments(private val exploreTM: ArrayList<ExploreFamousMonumentsModel>) :
    RecyclerView.Adapter<ExploreFamousMonuments.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.explore_famous_monuments, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = exploreTM[position]
        holder.monumentImage.setImageResource(currentItem.monumentImage)
        holder.monumentName.text= currentItem.monumentName
        holder.monumentState.text = currentItem.monumentState;
    }

    override fun getItemCount(): Int {
        return exploreTM.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val monumentImage: ImageView = itemView.findViewById(R.id.city_image)
        val monumentName: TextView = itemView.findViewById(R.id.monument_name)
        val monumentState: TextView = itemView.findViewById(R.id.state_name)
    }
}