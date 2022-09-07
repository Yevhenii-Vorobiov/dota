package com.example.dota.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dota.data.local.dao.HeroDao
import com.example.dota.data.local.db.converters.ListTypeConverter
import com.example.dota.data.models.Hero

@Database(entities = [Hero::class], version = 1)
@TypeConverters(ListTypeConverter::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun heroDao(): HeroDao
}