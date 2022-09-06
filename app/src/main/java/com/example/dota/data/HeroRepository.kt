package com.example.dota.data

import io.reactivex.Single
import javax.inject.Inject

class HeroRepository @Inject constructor(
    private val heroService: HeroService,
    private val heroDao: HeroDao
) {
    fun fetchHeroList(): Single<List<Hero>> = heroService.fetchHeroList()

    fun cacheHeroList(heroes: List<Hero>) {
        heroDao.insertAll(heroes)
    }

    fun getHeroListFromCache(): List<Hero> = heroDao.getAll()
}