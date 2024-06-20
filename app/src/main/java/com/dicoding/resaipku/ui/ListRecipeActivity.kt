package com.dicoding.resaipku.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.resaipku.data.adapter.ListRecipeAdapter
import com.dicoding.resaipku.R
import com.dicoding.resaipku.Recipe

class ListRecipeActivity : AppCompatActivity() {
    private lateinit var rvRecipe: RecyclerView
    private val list = ArrayList<Recipe>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_recipe)

        rvRecipe = findViewById(R.id.rv_recipe)
        rvRecipe.setHasFixedSize(true)

        list.addAll(getListRecipe())
        showRecyclerList()
    }
    private fun getListRecipe(): ArrayList<Recipe> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listRecipe = ArrayList<Recipe>()
        for (i in dataName.indices) {
            val recipe = Recipe(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listRecipe.add(recipe)
        }
        return listRecipe
    }

    private fun showRecyclerList() {
        rvRecipe.layoutManager = LinearLayoutManager(this)
        val ListRecipeAdapter = ListRecipeAdapter(list)
        rvRecipe.adapter = ListRecipeAdapter

        ListRecipeAdapter.setOnItemClickCallback(object : ListRecipeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Recipe) {
                showSelectedRecipe(data)
            }
        })
    }

    private fun showSelectedRecipe(recipe: Recipe) {
        val moveIntent = Intent(this@ListRecipeActivity, RecipeDetailActivity::class.java)
        moveIntent.putExtra("foto", recipe.photo)
        moveIntent.putExtra("nama", recipe.name)
        moveIntent.putExtra("deskripsi", recipe.description)
        startActivity(moveIntent)
    }
}