package com.ardy.jetpackardy.tv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.databinding.ItemsTvBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TvAdapter  : RecyclerView.Adapter<TvAdapter.CourseViewHolder>() {
    private var listTv = ArrayList<TvResponse>()
    private var onItemClickCallback: OnItemClickCallback? = null
    fun setCourses(courses: List<TvResponse>) {
       listTv.clear()
       listTv.addAll(courses)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemsAcademyBinding = ItemsTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(itemsAcademyBinding)
    }
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = listTv[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listTv.size


    inner class CourseViewHolder(private val binding: ItemsTvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(Tv: TvResponse) {
            with(binding) {
                tvItemTitle.text = Tv.name
                Glide.with(itemView.context)
                    .load("https://image.tmdb.org/t/p/w185" + Tv.posterPath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error))
                    .into(imgPoster)
                itemView.setOnClickListener {
                    onItemClickCallback?.onItemClicked(Tv)
                }
            }
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: TvResponse)
    }
}