package com.ardy.jetpackardy.home

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.data.TvEntity
import com.ardy.jetpackardy.databinding.ItemsMovtvBinding
import com.ardy.jetpackardy.detail.DetailMoviesActivity
import com.ardy.jetpackardy.detail.DetailTvActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AdapterMainTV: RecyclerView.Adapter<AdapterMainTV.WeatherViewHolder>() {

    private val mData = ArrayList<TvEntity>()

    fun setData(items: ArrayList<TvEntity>) {
        mData.clear()
        mData.addAll(items)
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): WeatherViewHolder {
        val mView = LayoutInflater.from(viewGroup.context).inflate(R.layout.items_movtv, viewGroup, false)
        return WeatherViewHolder(mView)
    }

    override fun onBindViewHolder(weatherViewHolder: WeatherViewHolder, position: Int) {
        weatherViewHolder.bind(mData[position])
    }



    override fun getItemCount(): Int = mData.size

    inner class WeatherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemsMovtvBinding.bind(itemView)
        fun bind(Tv: TvEntity) {
            with(binding) {
                tvItemTitle.text = Tv.title
                tvItemDate.text = itemView.resources.getString(R.string.durasi, Tv.time)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvActivity::class.java)
                    intent.putExtra(DetailMoviesActivity.EXTRA_COURSE, Tv.Id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(Tv.imagePath)
                        .apply(
                                RequestOptions.placeholderOf(R.drawable.ic_loading)
                                        .error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }
    }

}
