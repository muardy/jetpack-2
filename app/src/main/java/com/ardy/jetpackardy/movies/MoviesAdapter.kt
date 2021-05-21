package com.ardy.jetpackardy.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.data.MovieEntity
import com.ardy.jetpackardy.databinding.ItemsMovtvBinding
import com.ardy.jetpackardy.detail.DetailMoviesActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.CourseViewHolder>() {
    private var listCourses = ArrayList<MovieEntity>()

    fun setCourses(courses: List<MovieEntity>?) {
        if (courses == null) return
        this.listCourses.clear()
        this.listCourses.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemsAcademyBinding = ItemsMovtvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = listCourses[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listCourses.size


    class CourseViewHolder(private val binding: ItemsMovtvBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(course: MovieEntity) {
            with(binding) {
                tvItemTitle.text = course.title
                tvItemDate.text = itemView.resources.getString(R.string.durasi, course.time)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMoviesActivity::class.java)
                    intent.putExtra(DetailMoviesActivity.EXTRA_COURSE, course.Id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(course.imagePath)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                    .into(imgPoster)
            }
        }
    }
}