package com.dream.dreamteller

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            //AppLogger.init()
            //Timber.plant(Timber.DebugTree())
        }

        // start Koin!
        startKoin {
            // Android context
            androidContext(this@BaseApplication)
            // modules
            //modules(appModules)
        }
    }
}