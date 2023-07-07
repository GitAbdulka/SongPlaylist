package com.example.myplaylistapp.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "songs")
data class Songs(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var playlist_id: Int,
    var name: String,
    var actor_id: Int
)