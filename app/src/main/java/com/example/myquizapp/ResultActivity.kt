package com.example.myquizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.myquizapp.QuizQuestionsActivity.Companion.KEY

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val score= intent.getStringExtra(KEY)
        val tvScore: TextView= findViewById(R.id.resultTv)
        tvScore.text="Your Score: $score/10"
    }

    fun exit(view: View) {
        finish()
    }
}