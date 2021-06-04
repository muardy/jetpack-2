package com.ardy.jetpackardy.tontonApp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.ardy.jetpackardy.DataDummy
import com.ardy.jetpackardy.FakeRepo
import com.ardy.jetpackardy.movies.Movieresponse
import com.ardy.jetpackardy.tv.TvResponse
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TontonViewTest {
    private lateinit var tontonView: TontonView

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var observerMovie: Observer<List<Movieresponse>>
    @Mock
    private lateinit var observerTVShow: Observer<List<TvResponse>>

    @Mock
    private lateinit var repository: FakeRepo

    @Before
    fun setUp() {
       tontonView = TontonView(repository)
    }

    @Test
    fun getMovies() {
        val dummyMovie = DataDummy.generateDataMovies()
        val movies = MutableLiveData<List<Movieresponse>>()
        movies.value = dummyMovie

        Mockito.`when`(repository.getPopularMovies()).thenReturn(movies as LiveData<ArrayList<Movieresponse>>)
        val movieEntities = tontonView.getMovies().value
        Mockito.verify(repository).getPopularMovies()
        Assert.assertNotNull(movies)
        Assert.assertEquals(4, movieEntities?.size)

        tontonView.getMovies().observeForever(observerMovie)
        Mockito.verify(observerMovie).onChanged(dummyMovie)
    }

    @Test
    fun getTVShow() {

        val dummyTVShow = DataDummy.generateDataTVShow()
        val tvShow = MutableLiveData<List<TvResponse>>()
        tvShow.value = dummyTVShow

        Mockito.`when`(repository.getPopularTv()).thenReturn(tvShow as LiveData<ArrayList<TvResponse>>)
        val tvshowEntities = tontonView.getTVShow().value
        Mockito.verify(repository).getPopularTv()
        Assert.assertNotNull(tvShow)
        Assert.assertEquals(4, tvshowEntities?.size)

        tontonView.getTVShow().observeForever(observerTVShow)
        Mockito.verify(observerTVShow).onChanged(dummyTVShow)
    }
}