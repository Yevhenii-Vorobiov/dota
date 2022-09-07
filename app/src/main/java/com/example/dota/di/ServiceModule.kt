package com.example.dota.di

import com.example.dota.data.remote.HeroService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Singleton
    @Provides
    fun provideHeroService(retrofit: Retrofit): HeroService = retrofit.create(HeroService::class.java)
}