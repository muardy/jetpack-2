package com.ardy.jetpackardy.tv

import androidx.lifecycle.ViewModel
import com.ardy.jetpackardy.data.TvEntity
import com.ardy.jetpackardy.utils.DataDummy

class TvViewModel : ViewModel() {
    fun getCourses(): List<TvEntity> = DataDummy.generateTV()
}