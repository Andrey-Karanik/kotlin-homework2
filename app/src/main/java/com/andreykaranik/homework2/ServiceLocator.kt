package com.andreykaranik.homework2

import android.annotation.SuppressLint
import android.content.Context
import com.andreykaranik.homework2.businessLayer.CatProvider
import com.andreykaranik.homework2.datalayer.IAccessor

@SuppressLint("StaticFieldLeak")
object ServiceLocator {
    lateinit var context: Context

    private val accessor by lazy {IAccessor.create(context.getString(R.string.base_url))}

    fun initialize(context: Context) {
        this.context = context.applicationContext
    }

    fun provider(): CatProvider {
        return CatProvider(accessor)
    }
}