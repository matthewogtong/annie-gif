package com.example.anniegif.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.anniegif.databinding.GifImageBinding
import com.example.anniegif.extensions.loadUrl
import com.example.anniegif.model.Gifs

class GifListAdapter : RecyclerView.Adapter<GifListAdapter.GifListHolder>(){
    private val gifList = mutableListOf<Gifs>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifListHolder {
        return GifListHolder.getInstance(parent)
    }

    override fun getItemCount(): Int {
        return gifList.size
    }

    override fun onBindViewHolder(holder: GifListAdapter.GifListHolder, position: Int) {
        holder.loadInfo(gifList[position])
    }

    fun updateGifs(gif: Gifs) {
        val size = this.gifList.size
        this.gifList.clear()
        notifyItemRangeRemoved(0, size)

        this.gifList.addAll(gifList)
        notifyItemRangeInserted(0, gifList.size)
    }

    class GifListHolder(
        private val binding: GifImageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun loadInfo(gif: Gifs) = with(binding) {
            gif?.url?.let { ivGif.loadUrl(it) }
        }

        companion object {

            fun getInstance(parent: ViewGroup): GifListHolder {
                val binding = GifImageBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )

                return GifListHolder(binding)
            }
        }
    }
}