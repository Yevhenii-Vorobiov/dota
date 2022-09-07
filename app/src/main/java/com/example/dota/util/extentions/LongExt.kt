package com.example.dota.util.extentions

import java.util.*
import java.util.concurrent.TimeUnit

fun Long.cacheThresholdPassed(): Boolean{
    val currentTime = Calendar.getInstance()
    val cachedTime = Calendar.getInstance()
    cachedTime.timeInMillis = this
    val diff = currentTime.timeInMillis - cachedTime.timeInMillis
    val hours = TimeUnit.MILLISECONDS.toHours(diff)
    return hours >= 2
}