package com.example.dota.di

import android.content.Context
import androidx.room.Room
import com.example.dota.data.local.db.AppDatabase
import com.example.dota.data.local.dao.HeroDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    private const val DATABASE_NAME = "dota-database"

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase = Room
        .databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
        .build()

    @Provides
    @Singleton
    fun provideHeroDao(database: AppDatabase): HeroDao = database.heroDao()
}