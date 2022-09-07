package com.example.dota.data.local.db.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import javax.inject.Inject

class ListTypeConverter{
    @TypeConverter
    fun fromListToString(roles: List<String>): String {
        return Gson().toJson(roles)
    }

    @TypeConverter
    fun fromStringToList(json: String): List<String> {
        return Gson().fromJson(json, Array<String>::class.java).toMutableList()
    }
}