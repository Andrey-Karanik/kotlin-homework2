package com.andreykaranik.homework2

import android.app.Application

class CatApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ServiceLocator.initialize(this)
    }
}