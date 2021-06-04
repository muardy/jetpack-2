package com.ardy.jetpackardy.tontonApp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import com.ardy.jetpackardy.DataDummy
import com.ardy.jetpackardy.FakeRepo
import com.ardy.jetpackardy.movies.Movieresponse
import com.ardy.jetpackardy.tv.TvResponse
import org.junit.Assert
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class TontonDetailViewTest{
    private lateinit var viewModel: TontonDetailView

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: FakeRepo

    private val Movie_id = 460465
    private val idTVShow = 60735


    @Before
    fun setUp() {
        viewModel = TontonDetailView(repository)
    }


    @Test
    fun setSelectedData() {
        viewModel.setSelectedData(Movie_id)
        Assert.assertEquals(Movie_id, viewModel.id)
    }

    @Test
    fun getSelectedMovie() {
        viewModel.setSelectedData(Movie_id)

        val dummyMovie = DataDummy.generateDataMovies()[0]
        val movies = MutableLiveData<Movieresponse>()
        movies.value = dummyMovie

        Mockito.`when`(repository.getDetailMovies(Movie_id)).thenReturn(movies)
        val dataMovie = viewModel.getSelectedMovie().value
        Mockito.verify(repository).getDetailMovies(Movie_id)

        Assert.assertNotNull(dataMovie)

        assertEquals(dummyMovie.id, dataMovie?.id)
        assertEquals(dummyMovie.title, dataMovie?.title)
        assertEquals(dummyMovie.posterPath, dataMovie?.posterPath)
        assertEquals(dummyMovie.voteAverage, dataMovie?.voteAverage)
        assertEquals(dummyMovie.releaseDate, dataMovie?.releaseDate)
        assertEquals(dummyMovie.genres, dataMovie?.genres)
        assertEquals(dummyMovie.overview,dataMovie?.overview)
    }

    @Test
    fun getSelectedTVShow() {
        viewModel.setSelectedData(idTVShow)

        val dummyTVShow = DataDummy.generateDataTVShow()[0]
        val tvShow = MutableLiveData<TvResponse>()
        tvShow.value = dummyTVShow

        Mockito.`when`(repository.getDetailTV(idTVShow)).thenReturn(tvShow)
        val dataTVShow = viewModel.getSelectedTVShow().value
        Mockito.verify(repository).getDetailTV(idTVShow)

        Assert.assertNotNull(dataTVShow)

        assertEquals(dummyTVShow.id, dataTVShow?.id)
        assertEquals(dummyTVShow.name, dataTVShow?.name)
        assertEquals(dummyTVShow.posterPath, dataTVShow?.posterPath)
        assertEquals(dummyTVShow.voteAverage, dataTVShow?.voteAverage)
        assertEquals(dummyTVShow.firstAirDate, dataTVShow?.firstAirDate)
        assertEquals(dummyTVShow.episodes, dataTVShow?.episodes)
        assertEquals(dummyTVShow.firstAirDate, dataTVShow?.firstAirDate)
        assertEquals(dummyTVShow.overview,dataTVShow?.overview)
    }

}