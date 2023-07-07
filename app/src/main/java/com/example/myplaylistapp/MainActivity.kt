package com.example.myplaylistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myplaylistapp.Database.SongsDao
import com.example.myplaylistapp.Database.SongsDatabase
import com.example.myplaylistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var adapter = SongsAdapter()
    private lateinit var dao: SongsDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dao = SongsDatabase.getDatabase(this).dao()

        binding.rwSongs.adapter = adapter
        adapter.songsList = dao.getSongsWithActorAndPlaylist().toMutableList()
        Log.d("birzat", dao.getSongsWithActorAndPlaylist().toMutableList().toString())

    }
}