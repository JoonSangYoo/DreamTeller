package com.dream.dreamteller.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.dream.dreamteller.R
import com.dream.dreamteller.databinding.ActivityMainBinding
import com.dream.dreamteller.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    MainViewModel::class
) {

    override fun onCreate() {

    }

}