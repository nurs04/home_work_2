package com.example.lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var plantList:ArrayList<Plant>
    private lateinit var plantAdapter: PlantAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        plantList = ArrayList()
        plantList.add(Plant(R.drawable.img, "Kanaplia"))
        plantList.add(Plant(R.drawable.img_1, "Marihuana"))
        plantList.add(Plant(R.drawable.img_2, "Geroin"))
        plantList.add(Plant(R.drawable.img_3, "Laba"))
        plantList.add(Plant(R.drawable.img_4, "Geroin #2"))

        plantAdapter = PlantAdapter(plantList)
        recyclerView.adapter = plantAdapter
    }
}