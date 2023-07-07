package com.example.myplaylistapp.Database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface SongsDao {

    @Transaction
    @Query("SELECT * from actor")
    fun getSongsWithActorAndPlaylist():List<ActorWithSongs>

}