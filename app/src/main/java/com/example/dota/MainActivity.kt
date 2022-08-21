package com.example.dota

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    var a = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a = 1
        Timber.d("dota / onCreate / $a")
    }

    override fun onStart() {
        super.onStart()
        a = 2
        Timber.d("dota / onStart / $a" )
    }

    override fun onResume() {
        super.onResume()
        a = 3
        Timber.d("dota / onResume / $a")
    }

    override fun onPause() {
        super.onPause()
        a = 4
        Timber.d("dota / onPause / $a")
    }

    override fun onStop() {
        super.onStop()
        a = 5
        Timber.d("dota / onStop / $a")
    }

    override fun onDestroy() {
        super.onDestroy()
        a = 6
        Timber.d("dota / onDestroy / $a")
    }
}

//navigate
//fragments
//do 3 fragments (home page , круглая кнопка ) (list of heroes) (details of the hero)