package com.example.dota.presentation.heroDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dota.R
import com.example.dota.databinding.FragmentHeroDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroDetailsFragment : Fragment(R.layout.fragment_hero_details) {

    private lateinit var binding: FragmentHeroDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeroDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }
}