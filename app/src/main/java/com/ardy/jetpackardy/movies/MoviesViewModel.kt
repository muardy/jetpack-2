package com.ardy.jetpackardy.movies

import androidx.lifecycle.ViewModel
import com.ardy.jetpackardy.data.MovieEntity
import com.ardy.jetpackardy.utils.DataDummy

class MoviesViewModel : ViewModel() {
    fun getCourses(): List<MovieEntity> = DataDummy.generateDummyCourses()
}