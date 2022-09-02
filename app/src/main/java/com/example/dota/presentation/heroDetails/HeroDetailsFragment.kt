package com.example.dota.presentation.heroDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.dota.R
import com.example.dota.databinding.FragmentHeroDetailsBinding
import com.example.dota.util.extentions.dataBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroDetailsFragment : Fragment() {

    private val binding: FragmentHeroDetailsBinding by dataBinding(R.layout.fragment_hero_details)
    private val args: HeroDetailsFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.hero = args.hero
        return binding.root
    }
}