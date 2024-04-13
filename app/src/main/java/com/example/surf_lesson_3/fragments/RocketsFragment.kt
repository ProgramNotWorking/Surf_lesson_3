package com.example.surf_lesson_3.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.surf_lesson_3.adapters.RocketsAdapter
import com.example.surf_lesson_3.databinding.RocketsFragmentBinding
import com.example.surf_lesson_3.functions.getRocketsItemsList

class RocketsFragment(private val actContext: Context) : Fragment() {

    private lateinit var binding: RocketsFragmentBinding
    private val adapter = RocketsAdapter()

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RocketsFragmentBinding.inflate(inflater, container, false)

        binding.apply {
            rocketsRecyclerView.layoutManager = GridLayoutManager(actContext, 1)
            rocketsRecyclerView.adapter = adapter

            for (item in getRocketsItemsList()) {
                adapter.addItem(item)
            }
        }

        return binding.root
    }

}