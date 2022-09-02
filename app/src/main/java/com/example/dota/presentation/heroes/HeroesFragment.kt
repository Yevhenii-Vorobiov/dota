package com.example.dota.presentation.heroes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.dota.R
import com.example.dota.data.Hero
import com.example.dota.databinding.FragmentHeroesBinding
import com.example.dota.util.extentions.dataBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroesFragment : Fragment() {

    private val binding: FragmentHeroesBinding by dataBinding(R.layout.fragment_heroes)
    private val viewModel: HeroesViewModel by viewModels()
    private val heroesAdapter: HeroesAdapter = HeroesAdapter { hero ->
        navigateToHeroDetails(hero)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    private fun navigateToHeroDetails(hero: Hero) {
        val action = HeroesFragmentDirections.actionHeroesFragmentToHeroDetailsFragment(hero)
        findNavController().navigate(action)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getHeroes()
        viewModel.heroesLiveData.observe(viewLifecycleOwner) { heroes ->
            heroesAdapter.update(heroes)
        }
        viewModel.isLoading.observe(viewLifecycleOwner) {
            if (it == true) {
                binding.pbHeroesLoadingProgress.visibility = View.VISIBLE
            } else {
                binding.pbHeroesLoadingProgress.visibility = View.GONE
            }
        }
        binding.rvHeroes.adapter = heroesAdapter
    }
}