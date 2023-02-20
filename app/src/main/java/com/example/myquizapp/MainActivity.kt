package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button=findViewById(R.id.btnStart)
        val nameET: EditText=findViewById(R.id.nameET)

        btnStart.setOnClickListener{
            if(nameET.text.toString()==""){
                Toast.makeText(this,"Please enter name",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent= Intent(applicationContext,QuizQuestionsActivity::class.java)
                startActivity(intent)
            }
        }
    }
}