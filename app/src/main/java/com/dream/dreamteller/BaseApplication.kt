package com.dream.dreamteller

import android.app.Application
import com.dream.dreamteller.di.appModules
import com.dream.dreamteller.utils.AppLogger
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

/**
 * Created by joonsangyoo on 2020. 10. 21..
 */
class BaseApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        // 디버그 모드일때만 로그 남기기 위함
        if (BuildConfig.DEBUG) {
            AppLogger.init()
            Timber.plant(Timber.DebugTree())
        }

        // 코인 연동부분..
        startKoin {
            // Android context
            androidContext(this@BaseApplication)
            // modules
            modules(appModules)
        }
    }
}