package com.example.dota.data

import io.reactivex.Single
import retrofit2.http.GET

interface HeroService {
    @GET("/api/heroStats")
    fun fetchHeroList(): Single<List<Hero>>
}