package com.dicoding.resaipku

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecipeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val foto : Int = intent.getIntExtra("foto",0)
        val nama : String? = intent.getStringExtra("nama")
        val deskripsi : String? = intent.getStringExtra("deskripsi")

        val imgView = findViewById(R.id.imgRecipe) as ImageView
        imgView.setImageResource(foto)
        val nameView = findViewById(R.id.tvRecipeTitle) as TextView
        nameView.text = nama
        val dView = findViewById(R.id.tvRecipeDesc) as TextView
        dView.text = deskripsi
    }
}