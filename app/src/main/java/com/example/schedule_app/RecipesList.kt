package com.example.schedule_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast

class RecipesList : AppCompatActivity() {
    // on below line we are
    // creating variables for listview
    lateinit var recipesLV: ListView

    // creating array adapter for listview
    lateinit var listAdapter: ArrayAdapter<String>

    // creating array list for listview
    lateinit var recipesList: ArrayList<String>;

    // creating variable for searchView
    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes_list)

        // initializing variables of list view with their ids.
        recipesLV = findViewById(R.id.idLVRecipes)
        searchView = findViewById(R.id.idSV)

        // initializing list and adding data to list
        recipesList = ArrayList()
        recipesList.add("omelet with rice")
        recipesList.add("fried egg")
        recipesList.add("scramble eggs")
        recipesList.add("shakshuka")
        recipesList.add("cheesecakes")
        recipesList.add("avocado sandwich")


        // initializing list adapter and setting layout
        // for each list view item and adding array list to it.
        listAdapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            recipesList
        )

        // on below line setting list
        // adapter to our list view.
        recipesLV.adapter = listAdapter

        recipesLV.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(this,"Pressed item position: $position. Text: ${recipesList.get(position)}. Id: $id", Toast.LENGTH_SHORT).show()
        }

        // on below line we are adding on query
        // listener for our search view.
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // on below line we are checking
                // if query exist or not.
                if (recipesList.contains(query)) {
                    // if query exist within list we
                    // are filtering our list adapter.
                    listAdapter.filter.filter(query)
                } else {
                    // if query is not present we are displaying
                    // a toast message as no  data found..
                    Toast.makeText(this@RecipesList, "No Recipes found..", Toast.LENGTH_LONG)
                        .show()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // if query text is change in that case we
                // are filtering our adapter with
                // new text on below line.
                listAdapter.filter.filter(newText)
                return false
            }
        })
    }
}