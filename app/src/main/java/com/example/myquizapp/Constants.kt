package com.example.myquizapp

object Constants {
    fun getQuestions():ArrayList<Question> {
        val questionsList= ArrayList<Question>()

//        Q 1
        val que1= Question(1,
        "What country does this flag belong to?",
        R.drawable.arzentina,
        "Argentina","Australia","Armenia","Austria",
        1)
        questionsList.add(que1)
//        Q 2
        val que2= Question(2,
            "What country does this flag belong to?",
            R.drawable.afghanistan,
            "Argentina","Afghanistan","Bolivia","Mongolia",
            2)
        questionsList.add(que2)

//        Q 3
        val que3= Question(3,
            "What country does this flag belong to?",
            R.drawable.hungary,
            "Hungary","Argentina","Bolivia","Scotland",
            1)
        questionsList.add(que3)

//        Q 4
        val que4= Question(4,
            "What country does this flag belong to?",
            R.drawable.india,
            "Argentina","Afghanistan","India","Mongolia",
            3)
        questionsList.add(que4)

        //        Q 5
        val que5= Question(5,
            "What country does this flag belong to?",
            R.drawable.italy,
            "India","UAE","Bolivia","Italy",
            4)
        questionsList.add(que5)

        //        Q 6
        val que6= Question(6,
            "What country does this flag belong to?",
            R.drawable.japan,
            "Japan","Afghanistan","Bolivia","Mongolia",
            1)
        questionsList.add(que6)

        //        Q 7
        val que7= Question(7,
            "What country does this flag belong to?",
            R.drawable.mangolia,
            "Japan","India","Bolivia","Mongolia",
            4)
        questionsList.add(que7)


        //        Q 8
        val que8= Question(8,
            "What country does this flag belong to?",
            R.drawable.norway,
            "Argentina","Afghanistan","Norway","Mongolia",
            3)
        questionsList.add(que8)


        //        Q 9
        val que9= Question(9,
            "What country does this flag belong to?",
            R.drawable.paraguay,
            "Japan","Paraguay","Bolivia","Mongolia",
            2)
        questionsList.add(que9)


        //        Q 10
        val que10= Question(10,
            "What country does this flag belong to?",
            R.drawable.uae,
            "UAE","Afghanistan","Bolivia","Mongolia",
            1)

        questionsList.add(que10)

        return questionsList
    }

}