package com.example.dota

import android.app.Application
import timber.log.Timber

class DotaApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}