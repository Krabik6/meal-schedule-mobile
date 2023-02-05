package com.example.schedule_app.ui.fragments.main.recipesList.recipeDetails

import com.example.schedule_app.R
import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.schedule_app.models.ModelRow
import java.util.*

/*We Have Created Constructor of Custom Adapter and Pass
                context
                ArrayList<Int> which Contain images
                ArrayList<HashMap<String,String>> which contain name and version*/

//Here We extend over Adapter With BaseAdapter()

class RecipeDetailsAdapter(context: Context, info: ModelRow) : BaseAdapter() {

    //Passing Values to Local Variables
//    var image = image
    var info = info
    var context = context
    override fun getCount(): Int {
        return 0
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    //Store image and arraylist in Temp Array List we Required it later
//    var tempArrayList = ArrayList(image)


    //Auto Generated Method
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var myview = convertView
        val holder: ViewHolder



        if (convertView == null) {

            //If Over View is Null than we Inflater view using Layout Inflater
            val mInflater = (context as Activity).layoutInflater

            //Inflating our list_row.
            myview = mInflater!!.inflate(R.layout.fragment_recipe_details, parent, false)

            //Create Object of ViewHolder Class and set our View to it
            holder = ViewHolder()

            //Find view By Id For all our Widget taken in list_row.

            /*Here !! are use for non-null asserted two prevent From null.
             you can also use Only Safe (?.)

            */
            holder.mImageView = myview!!.findViewById<ImageView>(R.id.iconRow) as ImageView
            holder.mHeader = myview!!.findViewById<TextView>(R.id.titleRow) as TextView
            holder.mSubHeader = myview!!.findViewById<TextView>(R.id.durationRow) as TextView

            //Set A Tag to Identify our view.
            myview.tag = holder
        } else {

            //If Ouer View in not Null than Just get View using Tag and pass to holder Object.
            holder = myview!!.getTag() as ViewHolder
        }

        //Getting HasaMap At Perticular Position
        val map = info

        //Setting Image to ImageView by position
        holder.mImageView!!.setImageResource(map.image)

        //Setting name to TextView it's Key from HashMap At Position
        holder.mHeader!!.setText(map.title)

        //Setting version to TextView it's Key from HashMap At Position
        holder.mSubHeader!!.setText(map.desc)


        return myview

    }

    //Auto Generated Method
//    override fun getItem(p0: Int): Any {
//
//        return info
//
//    }

    //Auto Generated Method
//    override fun getItemId(p0: Int): Long {
//        return 0
//    }

    //Auto Generated Method

//    override fun getCount(): Int {
//
//        //Return Size Of ArrayList
//        return info.size
//    }


    //Create A class To hold over View like we taken in list_row.xml
    class ViewHolder {

        var mImageView: ImageView? = null
        var mHeader: TextView? = null
        var mSubHeader: TextView? = null
    }


    //Function to set data according to Search Keyword in ListView


        //This is to notify that data change in Adapter and Reflect the changes.



}