package com.andreykaranik.homework2.ui.main

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.andreykaranik.homework2.R
import com.andreykaranik.homework2.objects.Item
import com.squareup.picasso.Picasso

class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

    protected val image by lazy {view.findViewById<ImageView>(R.id.image)}
    protected val imageLoader by lazy { Picasso.get()}

    fun bind(item: Item) {
        val url = "https://cataas.com/cat/${item.imageId()}"
        imageLoader.load(url).into(image)
    }
}