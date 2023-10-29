package com.example.lesson7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlantAdapter(private val plantList: ArrayList<Plant>) : RecyclerView.Adapter<PlantAdapter.PlantHolder>(){
    class PlantHolder(item : View) : RecyclerView.ViewHolder(item) {
        val plantImage : ImageView = item.findViewById(R.id.image)
        val plantText : TextView = item.findViewById(R.id.title)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val viewLayout = LayoutInflater.from(parent.context).inflate(R.layout.recyler_view, parent, false)
        return PlantHolder(viewLayout)
    }
    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        val currentPlant = plantList[position]
        holder.plantImage.setImageResource(currentPlant.imageId)
        holder.plantText.text = currentPlant.title
    }
    override fun getItemCount() = plantList.size
}

