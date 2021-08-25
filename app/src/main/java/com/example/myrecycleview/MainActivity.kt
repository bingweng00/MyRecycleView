package com.example.myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycleview.data.MyAdapter
import com.example.myrecycleview.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("Speaker", 99.50, R.drawable.ic_baseline_battery_charging_full_24),
            Product("Computer", 2500.00, R.drawable.ic_baseline_color_lens_24),
            Product("Book", 10.50, R.drawable.ic_baseline_battery_charging_full_24),
            Product("Keyboard", 150.50, R.drawable.ic_baseline_color_lens_24),
            Product("Mouse", 80.50, R.drawable.ic_baseline_battery_charging_full_24),

            )

        val recyclerView : RecyclerView = findViewById(R.id.productRecycleView)
        recyclerView.adapter = MyAdapter(productList)
        recyclerView.setHasFixedSize(true)

    }
}