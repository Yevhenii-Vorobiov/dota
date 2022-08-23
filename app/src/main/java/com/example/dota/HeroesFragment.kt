package com.example.dota

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dota.databinding.FragmentHeroesBinding

class HeroesFragment : Fragment(R.layout.fragment_heroes) {

    private lateinit var binding: FragmentHeroesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeroesBinding.inflate(inflater, container, false)
        binding.btnNavigateToDetails.setOnClickListener {
            navigateToHeroDetails()
        }
        return binding.root
    }

    private fun navigateToHeroDetails() {
        findNavController().navigate(R.id.action_heroesFragment_to_heroDetailsFragment)
    }
}