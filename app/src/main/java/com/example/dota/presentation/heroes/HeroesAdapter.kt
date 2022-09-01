package com.example.dota.presentation.heroes

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.dota.data.Hero
import com.example.dota.databinding.ItemHeroBinding
import com.example.dota.di.RetrofitModule
import com.example.dota.util.extentions.loadFromString
import com.example.dota.util.extentions.loadFromUrl
import com.squareup.picasso.Picasso
import okhttp3.internal.notify

class HeroesAdapter(val onClick: (hero: Hero) -> Unit) : RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder>() {

    private var heroes: List<Hero> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHeroBinding.inflate(inflater, parent, false)
        return HeroesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        holder.bind(heroes[position])
    }

    override fun getItemCount(): Int = heroes.size

    fun update(heroList: List<Hero>) {
        // перезаписываем список героев после обновления
        heroes = heroList
        // вызываем метод который перерисовывает список на экране (визуально)
        notifyDataSetChanged()
    }

    inner class HeroesViewHolder(var binding: ItemHeroBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(hero: Hero) {
            binding.hero = hero
            val url = RetrofitModule.OPEN_DATA_API_URL + hero.img
            binding.ivHeroImage.loadFromUrl(url)
            binding.root.setOnClickListener {
                onClick.invoke(hero)
            }
        }
    }

}