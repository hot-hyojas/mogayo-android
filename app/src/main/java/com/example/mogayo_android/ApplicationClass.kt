package com.example.mogayo_android

import android.app.Application
import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging

class ApplicationClass : Application() {
    companion object {
        lateinit var fcmReference: FirebaseMessaging
    }

    override fun onCreate() {
        super.onCreate()

        fcmReference = FirebaseMessaging.getInstance()
    }
}