package com.example.dota.util.extentions

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.loadFromUrl(url: String){
    Picasso.get().load(url).into(this)
}