package com.dicoding.resaipku

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecipeDetailActivity : AppCompatActivity() {

    private lateinit var imgRecipe: ImageView
    private lateinit var tvRecipeTitle: TextView
    private lateinit var tvRecipeDesc: TextView
    private lateinit var tvRecipeIngredients: TextView
    private lateinit var tvIngredientsList: TextView
    private lateinit var tvRecipeSteps: TextView
    private lateinit var tvStepsList: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        imgRecipe = findViewById(R.id.imgRecipe)
        tvRecipeTitle = findViewById(R.id.tvRecipeTitle)
        tvRecipeDesc = findViewById(R.id.tvRecipeDesc)
        tvRecipeIngredients = findViewById(R.id.tvRecipeIngredients)
        tvIngredientsList = findViewById(R.id.tvIngredientsList)
        tvRecipeSteps = findViewById(R.id.tvRecipeSteps)
        tvStepsList = findViewById(R.id.tvStepsList)

        // Get data from Intent
        val recipeName = intent.getStringExtra("RECIPE_NAME")

        // Display data
        tvRecipeTitle.text = recipeName
        // Set other fields accordingly

        // Example data
        tvRecipeDesc.text = "Deskripsi singkat tentang resep $recipeName."
        tvIngredientsList.text = "1 buah bawang putih\n2 sendok makan minyak goreng\n3 butir telur"
        tvStepsList.text = "1. Panaskan minyak goreng dalam wajan.\n2. Tumis bawang putih hingga harum.\n3. Masukkan telur dan aduk hingga matang."
    }
}