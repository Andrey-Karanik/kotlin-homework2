package com.andreykaranik.homework2.objects

import com.google.gson.annotations.SerializedName

class Item {
    @SerializedName("_id") var id = ""

    fun imageId() = id
}