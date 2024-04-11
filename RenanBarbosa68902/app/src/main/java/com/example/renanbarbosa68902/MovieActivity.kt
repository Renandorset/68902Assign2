package com.example.renanbarbosa68902

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.renanbarbosa68902.MovieListHolder.movieItems
import com.example.renanbarbosa68902.databinding.ActivityMovieBinding

class MovieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieBinding

    private var clickPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clickPosition = intent.extras?.getInt("position") as Int

        Glide.with(this).load(movieItems[clickPosition].image).into(binding.previewImage)

        when (movieItems[clickPosition].certification) {
            "PG" -> binding.movieRating.setImageResource(R.drawable.rating_pg)
            "16" -> binding.movieRating.setImageResource(R.drawable.rating_16)
            "12A" -> binding.movieRating.setImageResource(R.drawable.rating_12a)
        }

        binding.movieName.text = movieItems[clickPosition].name
        binding.seatsLeftTv.text = "${movieItems[clickPosition].seats_remaining} seats remaining"
        binding.seatsSelected.text = movieItems[clickPosition].seats_selected.toString()
        binding.starringList.text = movieItems[clickPosition].starring.toString()
        binding.description.text = movieItems[clickPosition].description

        binding.subSeats.setOnClickListener {
            if (movieItems[clickPosition].seats_selected > 0) {
                binding.seatsSelected.text = (--movieItems[clickPosition].seats_selected).toString()
                binding.seatsLeftTv.text = "${++movieItems[clickPosition].seats_remaining} seats remaining"

                updateButtonState()
            }
        }

        binding.addSeats.setOnClickListener {
            if (movieItems[clickPosition].seats_remaining > 0) {
                binding.seatsSelected.text = (++movieItems[clickPosition].seats_selected).toString()
                binding.seatsLeftTv.text = "${--movieItems[clickPosition].seats_remaining} seats remaining"

                updateButtonState()
            }
        }

        updateButtonState()
    }

    private fun updateButtonState() {
        binding.subSeats.isEnabled = movieItems[clickPosition].seats_selected != 0
        binding.addSeats.isEnabled = movieItems[clickPosition].seats_remaining != 0
    }
}