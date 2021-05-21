package com.ardy.jetpackardy.home

import android.view.KeyEvent
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.utils.DataDummy
import org.junit.Rule
import org.junit.Test



class MainActivityTest {

    private val dummyCourse = DataDummy.generateDummyCourses()
    private val dummyCourseTv = DataDummy.generateTV()
    private val dummyCoursetest = DataDummy.Username()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyCourse.size))
    }

    @Test
    fun loadDetailMovie() {

        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.text_title)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title)).check(matches(withText(dummyCourse[0].title)))
        onView(withId(R.id.txt_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.txt_duration)).check(matches(withText(dummyCourse[0].time)))
        onView(withId(R.id.text_description)).check(matches(isDisplayed()))
        onView(withId(R.id.text_description)).check(matches(withText(dummyCourse[0].sinopsis)))
        onView(withId(R.id.txt_score)).check(matches(isDisplayed()))
        onView(withId(R.id.txt_score)).check(matches(withText(dummyCourse[0].score)))
        onView(withId(R.id.txt_release)).check(matches(isDisplayed()))
        onView(withId(R.id.txt_release)).check(matches(withText(dummyCourse[0].release)))
        onView(withId(R.id.txt_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.txt_genre)).check(matches(withText(dummyCourse[0].genre)))
        onView(withId(R.id.image_poster)).check(matches(isDisplayed()))
    }

    @Test
    fun loadTv() {
        onView(withText("TV Show")).perform(click())
        onView(withId(R.id.rv_bookmark)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_bookmark)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyCourseTv.size))


    }
    @Test
    fun loadDetailTv() {
        onView(withText("TV Show")).perform(click())
        onView(withId(R.id.rv_bookmark)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_bookmark)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(5, click()))
        onView(withId(R.id.text_title)).check(matches(isDisplayed()))
        onView(withId(R.id.text_title)).check(matches(withText(dummyCourseTv[5].title)))
        onView(withId(R.id.txt_duration)).check(matches(isDisplayed()))
        onView(withId(R.id.txt_duration)).check(matches(withText(dummyCourseTv[5].time)))
        onView(withId(R.id.text_description)).check(matches(isDisplayed()))
        onView(withId(R.id.text_description)).check(matches(withText(dummyCourseTv[5].sinopsis)))
        onView(withId(R.id.txt_score)).check(matches(isDisplayed()))
        onView(withId(R.id.txt_score)).check(matches(withText(dummyCourseTv[5].score)))
        onView(withId(R.id.txt_release)).check(matches(isDisplayed()))
        onView(withId(R.id.txt_release)).check(matches(withText(dummyCourseTv[5].release)))
        onView(withId(R.id.txt_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.txt_genre)).check(matches(withText(dummyCourseTv[5].genre)))
        onView(withId(R.id.image_poster)).check(matches(isDisplayed()))

    }






    @Test
    fun search() {
        val kosong = "Data Kosong"
        onView(withId(R.id.search)).check(matches(isDisplayed()))
        onView(withId(R.id.search)).perform(click())
        onView(withId(R.id.search_src_text)).perform(typeText(dummyCourse[0].title)).perform(pressKey(KeyEvent.KEYCODE_ENTER))
        onView(withText(kosong)).inRoot(ToastM()).check(matches(isDisplayed()))

    }








}