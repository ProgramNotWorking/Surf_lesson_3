package com.example.surf_lesson_3.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.surf_lesson_3.adapters.LaunchesAdapter
import com.example.surf_lesson_3.databinding.LauchesFragmentBinding
import com.example.surf_lesson_3.functions.getLaunchesItemsList

class LaunchesFragment(private val actContext: Context) : Fragment() {

    private lateinit var binding: LauchesFragmentBinding
    private val adapter = LaunchesAdapter()

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LauchesFragmentBinding.inflate(inflater, container, false)

        binding.apply {
            launchesRecyclerView.layoutManager = GridLayoutManager(actContext, 1)
            launchesRecyclerView.adapter = adapter

            for (item in getLaunchesItemsList()) {
                adapter.addItem(item)
            }
        }

        return binding.root
    }

}