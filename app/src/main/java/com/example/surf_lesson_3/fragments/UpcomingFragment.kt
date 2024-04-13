package com.example.surf_lesson_3.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.surf_lesson_3.databinding.UpcomingFragmentBinding

class UpcomingFragment : Fragment() {

    private lateinit var binding: UpcomingFragmentBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = UpcomingFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

}