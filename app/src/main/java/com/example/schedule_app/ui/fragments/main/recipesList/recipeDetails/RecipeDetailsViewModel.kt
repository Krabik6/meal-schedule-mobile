package com.example.schedule_app.ui.fragments.main.recipesList.recipeDetails

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.schedule_app.models.ModelRow

class RecipeDetailsViewModel : ViewModel() {
    val data: MutableLiveData<ModelRow> by lazy {
        MutableLiveData<ModelRow>()
    }
}