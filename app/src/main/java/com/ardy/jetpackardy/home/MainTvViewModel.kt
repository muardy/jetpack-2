package com.ardy.jetpackardy.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ardy.jetpackardy.data.TvEntity
import com.ardy.jetpackardy.utils.DataDummy

class MainTvViewModel : ViewModel() {
    companion object {
        private val TAG = MainTvViewModel::class.java.simpleName
    }

    val listGith = MutableLiveData<ArrayList<TvEntity>>()



    fun getGith(): LiveData<ArrayList<TvEntity>> {
        return listGith
    }


    fun getsearch(titlee: String){
        val listuser = ArrayList<TvEntity>()


        val items = DataDummy.generateTV()
        for(i in 0 until items.size){
            val timeArray = items.get(i).title.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

            Log.d(TAG, timeArray[0].toString())
            if(titlee == timeArray[0] || titlee == timeArray[0].toLowerCase()   ||titlee.contains(items.get(i).title)||titlee.contains(items.get(i).title.toLowerCase()) ) {

                val id = items.get(i).Id
                val title = items.get(i).title
                val duration = items.get(i).time
                val image = items.get(i).imagePath
                val user = TvEntity("$id", title, "", "", duration, "", "", image)
                user.title = title
                user.time = duration
                listuser.add(user)


            }
        }
        listGith.postValue(listuser)


    }


}