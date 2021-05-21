package com.ardy.jetpackardy.home

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.data.MovieEntity
import com.ardy.jetpackardy.data.TvEntity
import com.ardy.jetpackardy.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var adapter: AdapterMain
    private lateinit var mainViewModeltv: MainTvViewModel
    private lateinit var adaptertv: AdapterMainTV
    private lateinit var listuser : ArrayList<MovieEntity>
    private lateinit var listtv : ArrayList<TvEntity>
    private lateinit var listGith : MutableLiveData<ArrayList<MovieEntity>>

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
    private var coba: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.rvSearch.visibility= View.GONE
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        activityMainBinding.viewPager.adapter = sectionsPagerAdapter
        activityMainBinding.tabs.setupWithViewPager(activityMainBinding.viewPager)
        supportActionBar?.elevation = 0f



    }


    private fun showRecyclerList(){
        adapter = AdapterMain()
        adapter.notifyDataSetChanged()
        activityMainBinding.rvSearch.layoutManager = LinearLayoutManager(this)
        activityMainBinding.rvSearch.adapter= adapter

        mainViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainViewModel::class.java)
        mainViewModel.getGith().observe(this, { Github ->

            if (Github != null) {
                adapter.setData(Github)

            }

        })
    }

    private fun showRecyclerListtv(){


        adaptertv = AdapterMainTV()
        adaptertv.notifyDataSetChanged()
        activityMainBinding.rvSearch.layoutManager = LinearLayoutManager(this)
        activityMainBinding.rvSearch.adapter= adaptertv

        mainViewModeltv = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainTvViewModel::class.java)
        mainViewModeltv.getGith().observe(this, { Github ->

            if (Github != null) {
                adaptertv.setData(Github)

            }


        })
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        listuser = ArrayList<MovieEntity>()
        listGith = MutableLiveData<ArrayList<MovieEntity>>()
        listtv = ArrayList<TvEntity>()
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_watch, menu)
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        val searchView = menu.findItem(R.id.search).actionView as SearchView
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        showRecyclerList()
        showRecyclerListtv()
        adapter = AdapterMain()
        adapter.notifyDataSetChanged()
        activityMainBinding.rvSearch.layoutManager = LinearLayoutManager(this)
        activityMainBinding.rvSearch.adapter= adapter

        mainViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainViewModel::class.java)

        adaptertv = AdapterMainTV()
        adaptertv.notifyDataSetChanged()
        activityMainBinding.rvSearch.layoutManager = LinearLayoutManager(this)
        activityMainBinding.rvSearch.adapter= adaptertv

        mainViewModeltv = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainTvViewModel::class.java)

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(query: String): Boolean {
                if (query=="")

                {
                    Toast.makeText(this@MainActivity, "Data tidak bisa terload", Toast.LENGTH_SHORT).show()

                }
                activityMainBinding.progressBar.visibility = View.VISIBLE
                activityMainBinding.rvSearch.visibility = View.VISIBLE

                mainViewModeltv.getGith().observe(this@MainActivity, { Github ->
                    var j = 0
                    if(coba>1 )
                    {
                        coba -=1
                    }

                    if(coba <=-1){

                        coba +=1
                    }
                    if (Github != null) {
                        activityMainBinding.progressBar.visibility = View.INVISIBLE
                        adaptertv.setData(Github)
                        coba ++
                        if (coba==0)
                        {
                            coba++
                        }
                        for (i in 0 until Github.size) {
                            j++

                        }

                    }


                    if (j == 0) {
                        showRecyclerList()

                        mainViewModel.getsearch(query)
                        coba--
                        if (coba==1)
                        {
                            coba--
                        }

                        if(coba>1 )
                        {
                            coba --
                        }

                        if(coba <=-1)
                        {

                            coba ++
                        }

                    }


                })

                mainViewModeltv.getsearch(query)

                mainViewModel.getGith().observe(this@MainActivity, { Github ->
                    var j = 0
                    if(coba>1 )
                    {
                        coba -=1
                    }

                    if(coba <=-1)
                    {

                        coba +=1
                    }

                    if (Github != null) {
                        activityMainBinding.progressBar.visibility = View.INVISIBLE
                        adapter.setData(Github)
                        coba ++
                        if (coba==0)
                        {
                            coba++
                        }
                        for (i in 0 until Github.size) {

                            j++


                        }
                    }
                    if (j == 0) {

                        showRecyclerListtv()

                        mainViewModeltv.getsearch(query)
                        coba--
                        if (coba==1)
                        {
                            coba--
                        }

                        if(coba>1 )
                        {
                            coba --
                        }

                        if(coba <=-1)
                        {

                            coba ++
                        }
                    }



                })
                if(coba>1 )
                {
                    coba -=1
                }

                if(coba <=-1)
                {

                    coba +=1
                }
                if (coba==0)
                {
                    Toast.makeText(this@MainActivity, "Data Kosong", Toast.LENGTH_SHORT).show()
                }
                Log.d(TAG, coba.toString())
                searchView.clearFocus()
                return true

            }


            override fun onQueryTextChange(newText: String): Boolean {
                return false
            }
        })
        return true

    }


}