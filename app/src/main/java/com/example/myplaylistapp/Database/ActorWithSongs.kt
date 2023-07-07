package com.example.myplaylistapp.Database

import androidx.room.Embedded
import androidx.room.Relation

data class ActorWithSongs(
    @Embedded val actor: Actor,
    @Relation(
        parentColumn = "id",
        entityColumn = "actor_id"
    )
    val song: List<Songs>
)