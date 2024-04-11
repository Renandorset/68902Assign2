package com.example.renanbarbosa68902

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.renanbarbosa68902.databinding.ActivityMainBinding
import com.example.renanbarbosa68902.MovieListHolder.movieItems

class MainActivity : AppCompatActivity(), ClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = MovieAdapter(movieItems, this)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()

        binding.recyclerView.adapter?.notifyDataSetChanged()
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this, MovieActivity::class.java)
        intent.putExtra("position", position)
        startActivity(intent)
    }
}