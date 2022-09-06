package com.example.dota.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Hero::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun heroDao(): HeroDao
}