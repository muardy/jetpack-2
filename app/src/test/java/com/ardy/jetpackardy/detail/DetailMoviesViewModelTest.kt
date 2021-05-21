package com.ardy.jetpackardy.detail

import com.ardy.jetpackardy.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailMoviesViewModelTest {
    private lateinit var viewModel: DetailMoviesViewModel
    private val dummyCourse = DataDummy.generateDummyCourses()[0]
    private val courseId = dummyCourse.Id
    @Before
    fun setUp() {
        viewModel = DetailMoviesViewModel()
        viewModel.setSelectedCourse(courseId)
    }
    @Test
    fun getCourse() {
        viewModel.setSelectedCourse(dummyCourse.Id)
        val courseEntity = viewModel.getCourse()
        assertNotNull(courseEntity)
        assertEquals(dummyCourse.Id, courseEntity.Id)
        assertEquals(dummyCourse.genre, courseEntity.genre)
        assertEquals(dummyCourse.sinopsis, courseEntity.sinopsis)
        assertEquals(dummyCourse.imagePath, courseEntity.imagePath)
        assertEquals(dummyCourse.title, courseEntity.title)
        assertEquals(dummyCourse.time, courseEntity.time)
        assertEquals(dummyCourse.score, courseEntity.score)
        assertEquals(dummyCourse.release, courseEntity.release)

    }
}