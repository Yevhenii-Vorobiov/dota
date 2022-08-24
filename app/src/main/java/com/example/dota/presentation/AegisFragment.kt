package com.example.dota.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dota.R
import com.example.dota.databinding.FragmentAegisBinding

class AegisFragment : Fragment(R.layout.fragment_aegis) {

    private lateinit var binding: FragmentAegisBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAegisBinding.inflate(inflater, container, false)
        binding.btnNavigateToHeroes.setOnClickListener {
            navigateToHeroesFragment()
            //Toast.makeText(context, "All is good", Toast.LENGTH_LONG).show()
        }
        return binding.root
    }

    private fun navigateToHeroesFragment() {
        findNavController().navigate(R.id.action_aegisFragment_to_heroesFragment)
    }
}