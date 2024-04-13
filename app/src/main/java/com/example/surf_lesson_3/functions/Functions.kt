package com.example.surf_lesson_3.functions

import com.example.surf_lesson_3.R
import com.example.surf_lesson_3.dataclasses.LaunchItem
import com.example.surf_lesson_3.dataclasses.RocketsItem

fun getLaunchesItemsList(): MutableList<LaunchItem> {
    return mutableListOf(
        LaunchItem(
            R.drawable.starlink_2_logo, "Starlink 2",
            "CCAES SLC 40", "16-12-2014"
        ),
        LaunchItem(
            R.drawable.demosat_logo, "DemoSat",
            "AAAES SLC 40", "06-07-2018"
        ),
        LaunchItem(
            R.drawable.falcon9test_logo, "Falcon 9 Test",
            "CCAES SEC 40", "18-03-2019"
        ),
        LaunchItem(
            R.drawable.crs2_logo, "CRS - 2",
            "CCAES SLC 40", "18-12-2019"
        )
    )
}

fun getRocketsItemsList(): MutableList<RocketsItem> {
    return mutableListOf(
        RocketsItem(
            R.drawable.starlink_2_logo, "Falcon 1", false
        ),
        RocketsItem(
            R.drawable.falcon9_logo, "Falcon 9", true
        ),
        RocketsItem(
            R.drawable.falcon9test_logo, "Big falcon Rocket", false
        )
    )
}