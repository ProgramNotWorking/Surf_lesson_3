package com.example.surf_lesson_3.dataclasses

data class LaunchItem(
    val image: Int,
    val rocketName: String,
    val seriesNumber: String,
    val date: String
)

data class RocketsItem(
    val image: Int,
    val rocketName: String,
    val isActive: Boolean
) {
    val rocketState: String
        get() {
            return if (isActive) {
                "ACTIVE"
            } else {
                "INACTIVE"
            }
        }
}
