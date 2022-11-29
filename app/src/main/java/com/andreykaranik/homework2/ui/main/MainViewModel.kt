package com.andreykaranik.homework2.ui.main

import androidx.lifecycle.ViewModel
import com.andreykaranik.homework2.ServiceLocator

class MainViewModel : ViewModel() {
    private val provider = ServiceLocator.provider()

    suspend fun getCats() = provider.getCats(0, 100)
}