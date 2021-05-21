package com.ardy.jetpackardy.movies

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MoviesViewModelTest {

    private lateinit var viewModel: MoviesViewModel
    @Before
    fun setUp() {
        viewModel = MoviesViewModel()
    }

    @Test
    fun getCourses() {
        val mov = viewModel.getCourses()
        assertNotNull(mov)
        assertEquals(12, mov.size)
    }
}