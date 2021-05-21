package com.ardy.jetpackardy.detail

import androidx.lifecycle.ViewModel
import com.ardy.jetpackardy.data.TvEntity
import com.ardy.jetpackardy.utils.DataDummy

class DetailTvViewModel : ViewModel() {
    private lateinit var Id: String


    fun setSelectedCourse(courseId: String) {
        this.Id = courseId
    }

    fun getCourse(): TvEntity {
        lateinit var course: TvEntity
        val coursesEntities = DataDummy.generateTV()
        for (courseEntity in coursesEntities) {
            if (courseEntity.Id == Id) {
                course = courseEntity
            }
        }
        return course
    }


}