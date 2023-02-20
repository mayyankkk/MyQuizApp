package com.example.myquizapp

data class Question(
    val id:Int,
    val questions: String,
    val img: Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctAnswer:Int
    )
