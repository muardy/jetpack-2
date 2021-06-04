package com.ardy.jetpackardy.movies


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.databinding.ItemsMovtvBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.ArrayList

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.CourseViewHolder>() {
    private var listCourses = ArrayList<Movieresponse>()
    private var onItemClickCallback: OnItemClickCallback? = null

    fun setCourses(courses: ArrayList<Movieresponse>) {
        listCourses.clear()
        listCourses.addAll(courses)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemsAcademyBinding = ItemsMovtvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(itemsAcademyBinding)
    }


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = listCourses[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listCourses.size


    inner class CourseViewHolder(private val binding: ItemsMovtvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movieresponse) {
            with(binding) {
                tvItemTitle.text = movie.title
                tvItemDate.text = movie.voteAverage.toString()
                Glide.with(itemView.context)
                    .load("https://image.tmdb.org/t/p/w185" + movie.posterPath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)
                itemView.setOnClickListener {
                    onItemClickCallback?.onItemClicked(movie)
                }
            }
        }
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Movieresponse)
    }
}