package com.example.dota.data

import retrofit2.http.GET

interface HeroService {
    @GET("/api/heroes")
    fun fetchHeroList(): List<Hero>
}