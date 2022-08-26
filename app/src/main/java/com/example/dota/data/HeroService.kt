package com.example.dota.data

import io.reactivex.Single
import retrofit2.http.GET

interface HeroService {
    @GET("/api/heroes")
    fun fetchHeroList(): Single<List<Hero>>
}