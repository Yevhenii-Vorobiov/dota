package com.example.dota.util.extentions

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.dota.R
import com.squareup.picasso.Picasso

fun ImageView.loadFromUrl(url: String){
    Picasso.get().load(url).into(this)
}
@BindingAdapter("app:loadFromString")
fun ImageView.loadFromString(string: String?) {
    val attributeResource: Int = when (string) {

        "str" -> R.drawable.ic_hero_attribute_strength

        "agi" -> R.drawable.ic_hero_attribute_agility

        "int" -> R.drawable.ic_hero_attribute_intelligence

        else -> R.drawable.ic_launcher_background

    }
    Picasso.get().load(attributeResource).into(this)
}