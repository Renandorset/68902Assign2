package com.example.renanbarbosa68902

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter(
    private val movieItemList: MutableList<MovieItem>,
    private val clickListener: ClickListener
): RecyclerView.Adapter<MovieAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieItemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.movieName.text = movieItemList[position].name
        holder.starringList.text = movieItemList[position].starring.toString()
        holder.movieDuration.text = "${movieItemList[position].runnning_time_mins / 60}hrs ${movieItemList[position].runnning_time_mins % 60}mins"
        Glide.with(holder.preview.context).load(movieItemList[position].image).into(holder.preview)

        when (movieItemList[position].certification) {
            "PG" -> holder.movieRating.setImageDrawable(ResourcesCompat.getDrawable(holder.preview.context.resources, R.drawable.rating_pg, null))
            "16" -> holder.movieRating.setImageDrawable(ResourcesCompat.getDrawable(holder.preview.context.resources, R.drawable.rating_16, null))
            "12A" -> holder.movieRating.setImageDrawable(ResourcesCompat.getDrawable(holder.preview.context.resources, R.drawable.rating_12a, null))
        }

        if (movieItemList[position].seats_selected > 0) {
            holder.seatsRemaining.text = "${movieItemList[position].seats_selected} seats selected"
            holder.seatsRemaining.setTextColor(Color.GREEN)
            holder.seatIcon.imageTintList = null
            holder.seatIcon.imageTintList = ColorStateList.valueOf(Color.GREEN)
        } else {
            holder.seatsRemaining.text = "${movieItemList[position].seats_remaining} seats remaining"
            holder.seatsRemaining.setTextColor(Color.WHITE)
            holder.seatIcon.imageTintList = null
            holder.seatIcon.imageTintList = ColorStateList.valueOf(Color.WHITE)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val preview: ImageView = itemView.findViewById(R.id.preview_image)
        val movieName: TextView = itemView.findViewById(R.id.movie_name)
        val movieRating: ImageView = itemView.findViewById(R.id.movie_rating)
        val starringList: TextView = itemView.findViewById(R.id.starring_list)
        val movieDuration: TextView = itemView.findViewById(R.id.duration_tv)
        val seatIcon: ImageView = itemView.findViewById(R.id.seat_img)
        val seatsRemaining: TextView = itemView.findViewById(R.id.seats_left_tv)

        init {
            itemView.setOnClickListener {
                clickListener.onItemClick(adapterPosition)
            }
        }
    }
}