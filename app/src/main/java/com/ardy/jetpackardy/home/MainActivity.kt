package com.ardy.jetpackardy.home

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.databinding.ActivityMainBinding
import com.ardy.jetpackardy.tontonApp.SectionPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding


    companion object {
        @StringRes
        val TAB_TITLES = intArrayOf(
            R.string.movie,
            R.string.tvshow
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        val sectionsPagerAdapter = SectionPagerAdapter(this@MainActivity)
        activityMainBinding.viewPager.adapter = sectionsPagerAdapter

        TabLayoutMediator(activityMainBinding.tabs, activityMainBinding.viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
        supportActionBar?.elevation = 0f



    }










}