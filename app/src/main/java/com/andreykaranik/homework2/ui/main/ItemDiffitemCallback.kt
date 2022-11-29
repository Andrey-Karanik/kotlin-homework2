package com.andreykaranik.homework2.ui.main

import androidx.recyclerview.widget.DiffUtil
import com.andreykaranik.homework2.objects.Item

class ItemDiffitemCallback: DiffUtil.ItemCallback<Item>() {
    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.imageId() == newItem.imageId()
    }
}