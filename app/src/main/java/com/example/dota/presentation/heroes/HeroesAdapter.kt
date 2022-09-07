package com.example.dota.presentation.heroes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dota.data.models.Hero
import com.example.dota.databinding.ItemHeroBinding

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
            binding.root.setOnClickListener {
                onClick.invoke(hero)
            }
        }
    }

}