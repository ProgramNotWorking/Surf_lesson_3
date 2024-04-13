package com.example.surf_lesson_3

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.surf_lesson_3.fragments.LaunchesFragment
import com.example.surf_lesson_3.fragments.RocketsFragment
import com.example.surf_lesson_3.fragments.UpcomingFragment

class PagerAdapter(
    fragmentActivity: FragmentActivity, private val context: Context
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> UpcomingFragment()
            1 -> LaunchesFragment(context)
            2 -> RocketsFragment(context)
            else -> throw IllegalStateException("Unexpected position")
        }
    }

    fun getPageTitle(position: Int): String {
        return when (position) {
            0 -> context.getString(R.string.upcoming)
            1 -> context.getString(R.string.launches)
            2 -> context.getString(R.string.rockets)
            else -> throw IllegalStateException("Unexpected position")
        }
    }

}