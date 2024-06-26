package com.example.chapter_5_challenge.ui.fragments.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.chapter_5_challenge.databinding.ItemAnimeNewBinding
import com.example.chapter_5_challenge.ui.fragments.data.Anime
import com.example.chapter_5_challenge.ui.fragments.viewholder.AnimeViewHolder

class AnimeAdapter(private val animeAdapterListener: AnimeAdapterListener)
    : ListAdapter<Anime, AnimeViewHolder>(AnimeDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            itemViewBinding = ItemAnimeNewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            ),
            animeAdapterListener = animeAdapterListener,
        )
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.bindAnime(getItem(position))
    }
}