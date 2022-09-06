package com.example.dota.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HeroDao {
    @Query("SELECT * FROM heroes")
    fun getAll(): List<Hero>

    @Insert
    fun insertAll(heroes: List<Hero>)
}