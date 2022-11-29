package com.andreykaranik.homework2.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.andreykaranik.homework2.R
import com.andreykaranik.homework2.objects.Item

class ItemAdapter: ListAdapter<Item, ItemViewHolder>(ItemDiffitemCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val cat = getItem(position)
        holder.bind(cat)
    }
}