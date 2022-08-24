package com.example.dota.data

import javax.inject.Inject

class HeroRepository @Inject constructor(
    var heroService: HeroService
) {

    fun fetchHeroList(): List<Hero> = heroService.fetchHeroList()

}