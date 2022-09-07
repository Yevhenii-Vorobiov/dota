package com.example.dota.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dota.data.local.dao.HeroDao
import com.example.dota.data.models.Hero

@Database(entities = [Hero::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun heroDao(): HeroDao
}