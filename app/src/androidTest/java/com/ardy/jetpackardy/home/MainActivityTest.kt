package com.ardy.jetpackardy.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.tontonApp.EspressoIdlingR
import org.junit.After
import org.junit.Before
import org.junit.Test



class MainActivityTest {



    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingR.getEspressoIdlingResource())
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingR.getEspressoIdlingResource())
    }

    @Test
    fun loadMovie() {
        Espresso.onView(withText(R.string.movie)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rvTonton))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rvTonton)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                15
            )
        )
    }

    @Test
    fun loadDetailMovie() {
        Espresso.onView(withText(R.string.movie)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rvTonton)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                15,
                ViewActions.click()
            )
        )
        Espresso.onView(withId(R.id.text_title))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.text_description))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.txt_release))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.txt_deskscore))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.txt_deskrelease))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.image_poster))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun loadTv() {
        Espresso.onView(withText(R.string.tvshow)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rvTonton))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rvTonton)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                10
            )
        )
    }

    @Test
    fun loadDetailTv() {
        Espresso.onView(withText(R.string.tvshow)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rvTonton)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                10,
                ViewActions.click()
            )
        )
        Espresso.onView(withId(R.id.text_title))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.text_description))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.txt_release))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.txt_deskscore))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.txt_deskrelease))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.image_poster))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.image_poster))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.txt_duration))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

}