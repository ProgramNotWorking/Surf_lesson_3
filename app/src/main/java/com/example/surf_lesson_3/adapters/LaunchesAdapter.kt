package com.example.surf_lesson_3.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.surf_lesson_3.R
import com.example.surf_lesson_3.databinding.LaunchesItemBinding
import com.example.surf_lesson_3.dataclasses.LaunchItem

class LaunchesAdapter : RecyclerView.Adapter<LaunchesAdapter.ItemHolder>() {

    private val itemsList = mutableListOf<LaunchItem>()

    inner class ItemHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = LaunchesItemBinding.bind(view)

        fun bind(item: LaunchItem) = with(binding) {
            launchesImageView.setImageResource(item.image)
            launchesRocketNameTextView.text = item.rocketName
            launchesRocketSeriesTextView.text = item.seriesNumber
            launchesDateTextView.text = item.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.launches_item, parent, false
        )
        return ItemHolder(view)
    }

    override fun getItemCount(): Int = itemsList.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(itemsList[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addItem(item: LaunchItem) {
        itemsList.add(item)
        notifyDataSetChanged()
    }

}