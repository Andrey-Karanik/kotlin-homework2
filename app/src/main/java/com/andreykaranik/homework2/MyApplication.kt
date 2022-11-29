package com.andreykaranik.homework2

import android.app.Application

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ServiceLocator.initialize(this)
    }
}