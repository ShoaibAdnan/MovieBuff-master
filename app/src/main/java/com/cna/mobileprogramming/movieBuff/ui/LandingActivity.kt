package com.cna.mobileprogramming.movieBuff.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.cna.mobileprogramming.foodie.R

class LandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landing_page)
        val movieButton: Button = findViewById(R.id.all_movies_button)
        movieButton.setOnClickListener {
            val i = Intent(this@LandingActivity, MainActivity::class.java)
            startActivity(i)
        }

    }
}