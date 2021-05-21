package com.ardy.jetpackardy.detail

import com.ardy.jetpackardy.data.MovieEntity

interface DetailMoviesCallback {
    fun onShareClick(course: MovieEntity)
}