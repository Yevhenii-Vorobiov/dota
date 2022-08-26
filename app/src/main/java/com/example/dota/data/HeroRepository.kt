package com.example.dota.data

import io.reactivex.Single
import javax.inject.Inject

class HeroRepository @Inject constructor(
    private val heroService: HeroService
) {

    fun fetchHeroList(): Single<List<Hero>> = heroService.fetchHeroList()

}