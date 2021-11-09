package com.example.anniegif.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.anniegif.databinding.GifImageBinding
import com.example.anniegif.extensions.loadUrl
import com.example.anniegif.model.Gifs

class GifListAdapter : RecyclerView.Adapter<GifListAdapter.GifListHolder>(){
    private val gifList = mutableListOf<Gifs.Url>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GifListHolder {
        return GifListHolder.getInstance(parent)
    }

    override fun onBindViewHolder(holder: GifListHolder, position: Int) {
        holder.loadInfo(gifList[position])
    }

    override fun getItemCount(): Int {
        return gifList.size
    }



    fun updateGifs(gif:  List<Gifs.Url>) {
        val size = this.gifList.size
        this.gifList.clear()
        notifyItemRangeRemoved(0, size)

        this.gifList.addAll(gif)
        notifyItemRangeInserted(0, gif.size)
    }

    class GifListHolder(
        private val binding: GifImageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun loadInfo(gifInfo: Gifs.Url) = with(binding) {
            Log.d("gif_url", "you suck")
            gifInfo.url?.let { ivGif.loadUrl(it) }
            gifInfo.url?.let { Log.d("gif_url", it) }
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