package com.andreykaranik.homework2.ui.main

import androidx.lifecycle.ViewModel
import com.andreykaranik.homework2.businessLayer.CatProvider
import com.andreykaranik.homework2.datalayer.IAccessor

class MainViewModel : ViewModel() {
    private val accessor = IAccessor.create()
    private val provider = CatProvider(accessor)

    suspend fun getCats() = provider.getCats(0, 100)
}