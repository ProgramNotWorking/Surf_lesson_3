package com.example.surf_lesson_3

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.surf_lesson_3.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.apply {

            val adapter = PagerAdapter(this@MainActivity, this@MainActivity)
            viewPager.adapter = adapter

            tabLayout.setTabTextColors(
                Color.parseColor("#393939"),
                Color.parseColor("#FF0000")
            )

            tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FF0000"))
            tabLayout.setSelectedTabIndicatorHeight(0)

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = adapter.getPageTitle(position)
            }.attach()

        }

    }
}