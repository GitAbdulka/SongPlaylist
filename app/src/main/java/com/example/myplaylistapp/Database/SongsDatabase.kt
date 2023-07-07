package com.example.myplaylistapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Actor::class, Songs::class], version = 1)
abstract class SongsDatabase : RoomDatabase() {

    abstract fun dao(): SongsDao

    companion object {
        private var INSTANCE: SongsDatabase? = null
        fun getDatabase(context: Context): SongsDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, SongsDatabase::class.java, "songs.db")
                    .createFromAsset("songs.db")
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE!!
        }
    }
}