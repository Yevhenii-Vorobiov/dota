package com.example.dota.data.local.prefs

import android.content.SharedPreferences
import javax.inject.Inject

class HeroPreferences @Inject constructor(
    private val preferences: SharedPreferences
) {

    fun getHeroListLastTimeCached(): Long {
        return preferences.getLong(HERO_LIST_LAST_TIME_CACHED, 0)
    }

    fun setHeroListLastTimeCached(time: Long) {
        preferences.edit().putLong(HERO_LIST_LAST_TIME_CACHED, time).apply()
    }

    companion object {
        private const val HERO_LIST_LAST_TIME_CACHED = "hero_list_last_time_cached"
    }
}