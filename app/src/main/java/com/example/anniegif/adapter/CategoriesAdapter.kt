package com.example.anniegif.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.anniegif.databinding.CategoryNameBinding
import com.example.anniegif.model.Categories

class CategoriesAdapter : RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>() {
    private val categories = mutableListOf<Categories>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder.getInstance(parent)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
//        holder.loadInfo(categories[position])
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    class CategoryViewHolder(
        private val binding: CategoryNameBinding
    ) : RecyclerView.ViewHolder(binding.root) {

//        fun loadInfo(category: Category) = with(binding) {
//
//        }

        companion object {
            fun getInstance(parent: ViewGroup): CategoryViewHolder {
                val binding = CategoryNameBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )

                return CategoryViewHolder(binding)
            }
        }
    }


}