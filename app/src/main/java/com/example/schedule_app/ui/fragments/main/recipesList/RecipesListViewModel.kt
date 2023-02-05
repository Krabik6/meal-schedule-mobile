package com.example.schedule_app.ui.fragments.main.recipesList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecipesListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is list-recipes Fragment killall"
    }
    val text: LiveData<String> = _text








}