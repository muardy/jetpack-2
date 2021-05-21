package com.ardy.jetpackardy.home


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.data.MovieEntity
import com.ardy.jetpackardy.databinding.ItemsMovtvBinding
import com.ardy.jetpackardy.detail.DetailMoviesActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AdapterMain: RecyclerView.Adapter<AdapterMain.WeatherViewHolder>() {

    private val mData = ArrayList<MovieEntity>()

    fun setData(items: ArrayList<MovieEntity>) {
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
        fun bind(gith:MovieEntity ) {
            with(itemView){
                Glide.with(itemView.context)
                        .load(gith.imagePath)
                        .apply(    RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                        .into(binding.imgPoster)
                binding.tvItemTitle.text = gith.title
                binding.tvItemDate.text = itemView.resources.getString(R.string.durasi, gith.time)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoviesActivity::class.java)
                    intent.putExtra(DetailMoviesActivity.EXTRA_COURSE, gith.Id)
                    itemView.context.startActivity(intent)
                }

                }
            }
        }

    }
