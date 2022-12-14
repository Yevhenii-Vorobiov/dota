package com.example.dota.data.repositories

import com.example.dota.data.models.Hero
import com.example.dota.data.local.dao.HeroDao
import com.example.dota.data.local.prefs.HeroPreferences
import com.example.dota.data.remote.HeroService
import io.reactivex.Single
import java.util.*
import javax.inject.Inject

class HeroRepository @Inject constructor(
    private val heroService: HeroService,
    private val heroDao: HeroDao,
    private val heroPreferences: HeroPreferences
) {
    fun fetchHeroListUsingRxJava(): Single<List<Hero>> = heroService.fetchHeroListUsingRxJava()

    suspend fun fetchHeroListUsingCoroutines(): List<Hero> = heroService.fetchHeroListUsingCoroutines()

    suspend fun cacheHeroList(heroes: List<Hero>) {
        heroDao.insertAll(heroes)
        val time = Calendar.getInstance().timeInMillis
        heroPreferences.setHeroListLastTimeCached(time)
    }
    fun getLastTimeCached(): Long = heroPreferences.getHeroListLastTimeCached()

    suspend fun getHeroListFromCache(): List<Hero>? = heroDao.getAll()
}