package com.example.schedule_app

import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dharmendra.searchview.CustomAdapter
import com.example.schedule_app.models.ModelRow

class RecipesList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipes_list)

        //Find View By Id For Listview
        val listview = findViewById<ListView>(R.id.listView)

        //Find View By Id For SearchView
        val searchView = findViewById<SearchView>(R.id.searchView)

        /*Create and ArrayList of Integer Type To Store Images From drawable.Here we add Images to ArrayList.
        We have Images of Android Icons of Diffrent versions.
        */
        val image = ArrayList<Int>()
        image.add(R.drawable.dish1)
        image.add(R.drawable.dish2)
        image.add(R.drawable.dish3)
        image.add(R.drawable.dish4)
        image.add(R.drawable.dish5)
        image.add(R.drawable.dish6)
        image.add(R.drawable.dish7)
        image.add(R.drawable.dish8)
        image.add(R.drawable.dish9)
        image.add(R.drawable.dish10)
        image.add(R.drawable.dish11)
        image.add(R.drawable.dish12)
        image.add(R.drawable.dish12)
        image.add(R.drawable.dish14)


        // Here We take and Array of Android OS names in Same Sequence as we take Images.

        val name = arrayOf("fish with a rice", "chicken with smash potato and vegetables", "assorted sea creatures", "fried chicken with fries", "pig stakes", "meat balls with fries", "meat roulette",
            "chicken stake with fries and fresh salad", "pasta pomodoro", "beef cari", "stakes with sauce and fries", "salad and bread with baked pasta", "Shrimps with peppers")


        // Here We take and Array of Android OS Version in Same Sequence as we take Images and name.

        val duration = arrayOf("15", "16", "20", "22", "24", "30", "40",
            "41", "44", "50", "60", "70", "80", "59", "1")


        /*Create ArrayList of HashMap to Store Name and Version with Key value Pair at Same poition

        Ex:-
                At Position 1:
                                name:"Cupcake"
                                version:"1.5"
                At Position 2:
                                name:"Donut"
                                version:"1.6"
                                .
                                .
                                .
                                So On
        */
        val info = ArrayList<ModelRow>()

        //Here We take HashMap in that we add Name and Version from Array
        var tempInfo: ModelRow

        for (i in name.indices) {
//            hashMap = HashMap<String, String>()
//            hashMap["name"] = name[i]
//            hashMap["duration"] = duration[i]

            tempInfo = ModelRow(name[i], duration[i], image[i])


            //Add HashMap to ArrayList
            info.add(tempInfo)

            /*
            ArrayList Start with Position 0

             So we have At position 0:

                                name:"Cupcake"
                                version:"1.5"

            */

        }

        //We Have Created Custom Adapter Class in that we pass Context,Array of Image and ArrayList<Hashmap<String,String>>
        val customAdapter = CustomAdapter(this,  info)


        //Set Adapter to ArrayList
        listview.adapter = customAdapter

        //On Click for ListView Item
        listview.setOnItemClickListener { adapterView, view, position, l ->

            //Provide the data on Click position in our listview
            val tempInfo: ModelRow = customAdapter.getItem(position) as ModelRow
            Log.d("RecipesList", "1")

            Toast.makeText(this@RecipesList, "Name : " + tempInfo.title + "\nduration : " + tempInfo.desc, Toast.LENGTH_SHORT).show()
            Log.d("RecipesList", "2")
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                /*Call filter Method Created in Custom Adapter
                    This Method Filter ListView According to Search Keyword
                 */
                customAdapter.filter(newText)
                return false
            }
        })

    }

}
