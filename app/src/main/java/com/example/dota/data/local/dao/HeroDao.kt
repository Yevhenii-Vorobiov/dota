package com.example.dota.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dota.data.models.Hero

@Dao
interface HeroDao {
    @Query("SELECT * FROM heroes")
    suspend fun getAll(): List<Hero>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(heroes: List<Hero>)
}