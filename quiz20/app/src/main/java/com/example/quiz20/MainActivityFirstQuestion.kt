package com.example.quiz20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.quiz20.databinding.ActivityMainFirstQuestionBinding

class MainActivityFirstQuestion : AppCompatActivity() {

    private lateinit var binding: ActivityMainFirstQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_first_question)

        binding = ActivityMainFirstQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBinding()
    }
    fun GoToNextScreen (){

        val go = Intent (this, MainActivityMondayScreen::class.java)
        startActivity(go)
    }

    fun BackToFirstScreen (){

        val back = Intent ( this, MainActivityFirstScreen::class.java)
        startActivity(back)
    }

    fun setupBinding(){
        binding.textAmalero.setOnClickListener{
            GoToNextScreen()
        }

        binding.amarelo.setOnClickListener {
            BackToFirstScreen()
        }
        binding.vermelho.setOnClickListener {
            BackToFirstScreen()
        }
        binding.verde.setOnClickListener {
            BackToFirstScreen()
        }
        binding.azul.setOnClickListener {
            BackToFirstScreen()
        }

    }
}