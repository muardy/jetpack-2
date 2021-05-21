package com.ardy.jetpackardy.tv

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TvViewModelTest {
    private lateinit var viewModel: TvViewModel
    @Before
    fun setUp() {
        viewModel =TvViewModel()
    }
    @Test
    fun getCourses() {
        val Tv = viewModel.getCourses()
        assertNotNull(Tv)
        assertEquals(12, Tv.size)
    }
}