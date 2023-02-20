package com.example.myquizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class QuizQuestionsActivity : AppCompatActivity() {
    companion object{
        const val KEY= "com.example.myquizapp.score"
    }
    private var counter:Int=0
    private var score:Int=0
    private var flag: Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)
        reset()
        setQuestion()
    }

    private fun setQuestion() {
        val tvQn: TextView= findViewById(R.id.tvQn)
        val questionList= Constants.getQuestions()
        val imgFlag: ImageView=findViewById(R.id.imgFlag)
        val btn1: Button= findViewById(R.id.btn1)
        val btn2: Button= findViewById(R.id.btn2)
        val btn3: Button= findViewById(R.id.btn3)
        val btn4: Button= findViewById(R.id.btn4)
        if(counter in 0..9){
            val question= questionList[counter]
            tvQn.text=question.questions
            imgFlag.setImageResource(question.img)
            btn1.text= question.optionOne
            btn2.text= question.optionTwo
            btn3.text= question.optionThree
            btn4.text= question.optionFour
        }
    }

    fun check(view: View) {
        val questionList= Constants.getQuestions()
        val question= questionList[counter]
        val btn1: Button= findViewById(R.id.btn1)
        val btn2: Button= findViewById(R.id.btn2)
        val btn3: Button= findViewById(R.id.btn3)
        val btn4: Button= findViewById(R.id.btn4)
        if(flag){
            if(view.tag.toString() == question.correctAnswer.toString()){
                score++
                view.setBackgroundColor(Color.GREEN)
            }
            else{
                view.setBackgroundColor(Color.RED)
                when(question.correctAnswer){
                    1-> btn1.setBackgroundColor(Color.GREEN)
                    2->btn2.setBackgroundColor(Color.GREEN)
                    3->btn3.setBackgroundColor(Color.GREEN)
                    4->btn4.setBackgroundColor(Color.GREEN)
                }
            }
            flag=false
        }
    }

    @SuppressLint("ResourceAsColor")
    fun reset(){
        flag=true
        val btn1: Button= findViewById(R.id.btn1)
        val btn2: Button= findViewById(R.id.btn2)
        val btn3: Button= findViewById(R.id.btn3)
        val btn4: Button= findViewById(R.id.btn4)
        btn1.setBackgroundColor(R.color.purple_500)
        btn2.setBackgroundColor(R.color.purple_500)
        btn3.setBackgroundColor(R.color.purple_500)
        btn4.setBackgroundColor(R.color.purple_500)
    }
    fun result(view: View) {
        val intent= Intent(this,ResultActivity::class.java)
        val s=score.toString()
        intent.putExtra(KEY,s)
        startActivity(intent)
    }
    fun next(view: View) {
        if(counter==9){
            counter=9
            result(view)
        }
        else{
            counter++
            setQuestion()
            reset()
        }

    }


}