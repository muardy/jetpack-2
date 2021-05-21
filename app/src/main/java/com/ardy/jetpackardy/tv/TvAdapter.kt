package com.ardy.jetpackardy.tv

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.data.TvEntity
import com.ardy.jetpackardy.databinding.ItemsTvBinding
import com.ardy.jetpackardy.detail.DetailMoviesActivity
import com.ardy.jetpackardy.detail.DetailTvActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class TvAdapter  : RecyclerView.Adapter<TvAdapter.CourseViewHolder>() {
    private var listTv = ArrayList<TvEntity>()

    fun setCourses(courses: List<TvEntity>?) {
        if (courses == null) return
        this.listTv.clear()
        this.listTv.addAll(courses)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemsAcademyBinding = ItemsTvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CourseViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = listTv[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listTv.size


    class CourseViewHolder(private val binding: ItemsTvBinding) : RecyclerView.ViewHolder(binding.root) {
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