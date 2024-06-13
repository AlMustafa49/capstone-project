package com.dicoding.resaipku

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListRecipeActivity : AppCompatActivity() {

    private lateinit var imgCaptured: ImageView
    private lateinit var tvResep1: TextView
    private lateinit var tvResep2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detection)

        imgCaptured = findViewById(R.id.imgCaptured)
//        tvResep1 = findViewById(R.id.tvResep1)
//        tvResep2 = findViewById(R.id.tvResep2)

        // Display captured image
        // imgCaptured.setImageBitmap(capturedImageBitmap)

        tvResep1.setOnClickListener {
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("RECIPE_NAME", "Ayam Goreng")
            startActivity(intent)
        }

        tvResep2.setOnClickListener {
            val intent = Intent(this, RecipeDetailActivity::class.java)
            intent.putExtra("RECIPE_NAME", "Ayam Bakar")
            startActivity(intent)
        }

        // Tambahkan lebih banyak listener untuk resep lainnya
    }
}