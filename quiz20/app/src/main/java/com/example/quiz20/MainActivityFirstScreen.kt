package com.example.quiz20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.quiz20.R.layout.activity_main_first_screen
import com.example.quiz20.databinding.ActivityMainFirstScreenBinding

class MainActivityFirstScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMainFirstScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainFirstScreenBinding.inflate(layoutInflater)
        setup()
        setContentView(binding.root)
    }

    private fun setup(){
        setupClicks()
    }

    private fun goToNextScreen(activity:AppCompatActivity) {
        val go = Intent(this, activity::class.java)
        startActivity(go)
    }

    private fun setupClicks (){
        binding.imagemquiz.setOnClickListener {
            goToNextScreen(MainActivityFirstQuestion())
        }

    }



}