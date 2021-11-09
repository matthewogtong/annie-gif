package com.example.anniegif.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.anniegif.model.Categories
import com.example.anniegif.model.Gifs
import com.example.anniegif.repo.AnnieRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnnieViewModel : ViewModel() {

//    private val _categories = MutableLiveData<Categories>()
//    val categories: LiveData<Categories> get() = _categories

    private val _gifs = MutableLiveData<List<Gifs.Url>>()
    val gifs: LiveData<List<Gifs.Url>> get() = _gifs

//    fun getCategories() {
//        viewModelScope.launch(Dispatchers.IO) {
//            val response = AnnieRepo.getCategories()
//            val categoriesObject = if (response.isSuccessful) {
//                response.body()
//            } else {
//                null
//            }
//            categoriesObject?.let {
//                _categories.postValue(it)
//            }
//        }
//    }

    fun getGifs() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = AnnieRepo.getGifs("baka", 14)
            val gifsObject = if (response.isSuccessful) {
                response.body()
            } else {
                Log.d("gif url", "you suck")
                null
            }
            gifsObject?.let {
                _gifs.postValue(it.url)
            }
        }
    }


}