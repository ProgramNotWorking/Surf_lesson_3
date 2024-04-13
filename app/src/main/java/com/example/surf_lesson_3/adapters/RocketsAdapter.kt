package com.example.surf_lesson_3.adapters

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.surf_lesson_3.R
import com.example.surf_lesson_3.databinding.RocketsItemBinding
import com.example.surf_lesson_3.dataclasses.RocketsItem

class RocketsAdapter : RecyclerView.Adapter<RocketsAdapter.RocketHolder>() {

    private val itemsList = mutableListOf<RocketsItem>()

    inner class RocketHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = RocketsItemBinding.bind(view)

        fun bind(item: RocketsItem) = with(binding) {
            rocketsImageView.setImageResource(item.image)
            rocketNameTextView.text = item.rocketName
            rocketStatusTextView.text = item.rocketState
            if (item.isActive) {
                activeStatusHolder.setCardBackgroundColor(Color.parseColor("#08F801"))
            } else {
                activeStatusHolder.setCardBackgroundColor(Color.parseColor("#FF0000"))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RocketHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.rockets_item, parent, false
        )
        return RocketHolder(view)
    }

    override fun getItemCount(): Int = itemsList.size

    override fun onBindViewHolder(holder: RocketHolder, position: Int) {
        holder.bind(itemsList[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addItem(item: RocketsItem) {
        itemsList.add(item)
        notifyDataSetChanged()
    }

}