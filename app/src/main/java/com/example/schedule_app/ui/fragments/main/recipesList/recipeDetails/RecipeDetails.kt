package com.example.schedule_app.ui.fragments.main.recipesList.recipeDetails

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import com.example.schedule_app.R
import com.example.schedule_app.databinding.FragmentRecipeDetailsBinding


class RecipeDetails : Fragment() {

    private val data : RecipeDetailsViewModel by activityViewModels()


    private lateinit var viewModel: RecipeDetailsViewModel
    lateinit var binding: FragmentRecipeDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRecipeDetailsBinding.inflate(inflater)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RecipeDetailsViewModel::class.java)
        data.data.observe(activity as LifecycleOwner) {
            binding.recipeDetailsImage.setImageResource(it.image)
            binding.recipeDetailsRecipeName.text = it.title
            binding.recipeDetailsDuration.text = it.desc
        }
    }

    companion object {
        fun newInstance() = RecipeDetails()
    }

}