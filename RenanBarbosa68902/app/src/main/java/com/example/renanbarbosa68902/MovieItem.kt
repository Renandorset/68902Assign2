package com.example.renanbarbosa68902

data class MovieItem(
    val name: String,
    val image: String,
    val certification: String,
    val description: String,
    val starring: ArrayList<String>,
    val runnning_time_mins: Int,
    var seats_remaining: Int,
    var seats_selected: Int
)
