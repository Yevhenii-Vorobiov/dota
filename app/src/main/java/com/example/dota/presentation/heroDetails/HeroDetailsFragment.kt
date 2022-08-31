package com.example.dota.presentation.heroDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.dota.R
import com.example.dota.databinding.FragmentHeroDetailsBinding
import com.example.dota.di.RetrofitModule
import com.example.dota.util.extentions.loadFromUrl
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HeroDetailsFragment : Fragment(R.layout.fragment_hero_details) {

    private lateinit var binding: FragmentHeroDetailsBinding
    private val args: HeroDetailsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHeroDetailsBinding.inflate(inflater, container, false)
        val url = RetrofitModule.OPEN_DATA_API_URL + args.hero.img
        binding.ivHeroImage.loadFromUrl(url)
        return binding.root
    }
}