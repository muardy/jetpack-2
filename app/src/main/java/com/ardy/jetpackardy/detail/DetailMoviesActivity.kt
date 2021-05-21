package com.ardy.jetpackardy.detail

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import com.ardy.jetpackardy.R
import com.ardy.jetpackardy.data.MovieEntity
import com.ardy.jetpackardy.databinding.ActivityDetailMoviesBinding
import com.ardy.jetpackardy.databinding.ContentDetailMoviesBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions



class DetailMoviesActivity : AppCompatActivity() {
    private lateinit var detailContentBinding: ContentDetailMoviesBinding
    private lateinit var callback: DetailMoviesCallback
    private lateinit var mov : MovieEntity
    companion object {
        const val EXTRA_COURSE = "extra_course"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailCourseBinding = ActivityDetailMoviesBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailCourseBinding.detailContent

        setContentView(activityDetailCourseBinding.root)

        setSupportActionBar(activityDetailCourseBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMoviesViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val courseId = extras.getString(EXTRA_COURSE)
            if (courseId != null) {

                viewModel.setSelectedCourse(courseId)
                populateCourse(viewModel.getCourse() as MovieEntity)
            }




    }

    }



    private fun populateCourse(courseEntity: MovieEntity) {
        detailContentBinding.textTitle.text = courseEntity.title
        detailContentBinding.textDescription.text = courseEntity.sinopsis
        detailContentBinding.txtRelease.text = courseEntity.release
        detailContentBinding.txtGenre.text = courseEntity.genre
        detailContentBinding.txtDuration.text = courseEntity.time
        detailContentBinding.txtScore.text = courseEntity.score
        detailContentBinding.txtDeskscore.text = getString(R.string.nilai)
        detailContentBinding.txtDeskrelease.text = getString(R.string.rilis)
        detailContentBinding.txtDeskdurasi.text = getString(R.string.waktu)


        detailContentBinding.imgShare.setOnClickListener {
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




         with(detailContentBinding) {
             Glide.with(this.imagePoster)
                     .load(courseEntity.imagePath)
                     .transform(RoundedCorners(20))
                     .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                             .error(R.drawable.ic_error)).override(2000, 2000)

                     .into(imagePoster)
         }
//        detailContentBinding.btnStart.setOnClickListener {
//            val intent = Intent(this@DetailCourseActivity, CourseReaderActivity::class.java)
//            intent.putExtra(CourseReaderActivity.EXTRA_COURSE_ID, courseEntity.courseId)
//            startActivity(intent)
//        }
    }
}