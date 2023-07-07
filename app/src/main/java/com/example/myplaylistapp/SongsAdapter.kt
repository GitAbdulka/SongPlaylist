package com.example.myplaylistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myplaylistapp.Database.ActorWithSongs
import com.example.myplaylistapp.Database.Songs
import com.example.myplaylistapp.databinding.SongItemBinding

class SongsAdapter() : RecyclerView.Adapter<SongsAdapter.SongsViewHolder>() {

    var songsList = mutableListOf<ActorWithSongs>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class SongsViewHolder(private val binding: SongItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(song: ActorWithSongs) {
            binding.apply {
                twTitle.text = song.actor.name
                twSongs.text = Return(song.song)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongsViewHolder {
        return SongsViewHolder(
            SongItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = songsList.size

    override fun onBindViewHolder(holder: SongsViewHolder, position: Int) {
        holder.bind(songsList[position])
    }

    fun Return(list: List<Songs>) : String{
        var text: String
        var a = ""
        for(i in 0 until list.size) {
            text = list[i].name
            a+= "$text, "
        }
        return a
    }
}