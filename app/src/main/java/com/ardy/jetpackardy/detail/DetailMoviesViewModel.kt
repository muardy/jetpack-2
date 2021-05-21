package com.ardy.jetpackardy.detail

import androidx.lifecycle.ViewModel
import com.ardy.jetpackardy.data.MovieEntity
import com.ardy.jetpackardy.utils.DataDummy

class DetailMoviesViewModel : ViewModel() {
    private lateinit var Id: String

    fun setSelectedCourse(courseId: String) {
        this.Id = courseId
    }

    fun getCourse(): MovieEntity {
        lateinit var course: MovieEntity
        val coursesEntities = DataDummy.generateDummyCourses()
        for (courseEntity in coursesEntities) {
            if (courseEntity.Id == Id) {
                course = courseEntity
            }
        }
        return course
    }


}