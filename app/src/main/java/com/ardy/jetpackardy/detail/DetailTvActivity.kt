package com.ardy.jetpackardy.detail

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.data.TvEntity
import com.ardy.jetpackardy.databinding.ActivityDetailTvBinding
import com.ardy.jetpackardy.databinding.ContentDetailTvBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class DetailTvActivity : AppCompatActivity() {
    private lateinit var detailTvBinding: ContentDetailTvBinding

    companion object {
        const val EXTRA_COURSE = "extra_course"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailCourseBinding = ActivityDetailTvBinding.inflate(layoutInflater)
        detailTvBinding = activityDetailCourseBinding.detailContent

        setContentView(activityDetailCourseBinding.root)

        setSupportActionBar(activityDetailCourseBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailTvViewModel::class.java]


        val extras = intent.extras
        if (extras != null) {
            val courseId = extras.getString(EXTRA_COURSE)
            if (courseId != null) {

                viewModel.setSelectedCourse(courseId)
                populateCourse(viewModel.getCourse() as TvEntity)
            }

        }
    }

    private fun populateCourse(courseEntity:TvEntity) {
        detailTvBinding.textTitle.text = courseEntity.title
        detailTvBinding.textDescription.text = courseEntity.sinopsis
        detailTvBinding.txtRelease.text = courseEntity.release
        detailTvBinding.txtGenre.text = courseEntity.genre
        detailTvBinding.txtDuration.text = courseEntity.time
        detailTvBinding.txtScore.text = courseEntity.score
        detailTvBinding.txtDeskscore.text = getString(R.string.nilai)
        detailTvBinding.txtDeskrelease.text = getString(R.string.rilis)
        detailTvBinding.txtDeskdurasi.text = getString(R.string.waktu)

        detailTvBinding.imgShare.setOnClickListener {
            try {

                val mimeType = "text/plain"
                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"

                val shareIntent= ShareCompat.IntentBuilder
                        .from(Activity())
                        .setType(mimeType)
                        .setChooserTitle("Bagikan aplikasi ini sekarang.")
                        .setText(resources.getString(R.string.share_text, courseEntity.title))
                        .intent
                startActivity(shareIntent)


            }
            catch (e: Exception) {
                e.printStackTrace()
            }

        }
        with(detailTvBinding) {
            com.bumptech.glide.Glide.with(this.imagePoster)
                .load(courseEntity.imagePath)
                .transform(RoundedCorners(20))
                .apply(
                    com.bumptech.glide.request.RequestOptions.placeholderOf(com.ardy.jetpackardy.R.drawable.ic_loading)
                    .error(com.ardy.jetpackardy.R.drawable.ic_error)).override(2000, 2000)

                .into(imagePoster)
        }

    }
}