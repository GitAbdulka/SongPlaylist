package com.example.myplaylistapp.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "actor")
data class Actor(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name: String
)