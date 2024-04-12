package com.example.surf_lesson_3.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.surf_lesson_3.R

class LaunchesFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.upcoming_fragment, container, false)
        val textView = view.findViewById<TextView>(R.id.firstTextView)
        textView.text = "Second fragment"
        return view
    }

}