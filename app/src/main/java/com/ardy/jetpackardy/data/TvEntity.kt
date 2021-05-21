package com.ardy.jetpackardy.data

data class TvEntity(
        var Id: String,
        var title: String,
        var  sinopsis: String,
        var score: String,
        var time: String,
        var genre: String,
        var release: String,
        var imagePath: Int = 0
)