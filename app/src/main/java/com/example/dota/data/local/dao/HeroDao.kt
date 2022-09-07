package com.example.dota.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.dota.data.models.Hero

@Dao
interface HeroDao {
    @Query("SELECT * FROM heroes")
    fun getAll(): List<Hero>?

    @Insert
    fun insertAll(heroes: List<Hero>)
}