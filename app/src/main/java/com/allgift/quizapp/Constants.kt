package com.allgift.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belongs to?",
            R.drawable.argentina,
            "Argentina",
            "Ghana",
            "Austria",
            "Columbia",
            1)
        questionList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belongs to?",
            R.drawable.austrialia,
            "New Zealand",
            "Togo",
            "Austrialia",
            "Canada",
            3)
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belongs to?",
            R.drawable.brazil,
            "Brazil",
            "South Africa",
            "Germany",
            "Haiti",
            1)
        questionList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belongs to?",
            R.drawable.fiji,
            "Ethiopia",
            "Papua New Guinea",
            "Solomon Island",
            "Fiji",
            4)
        questionList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belongs to?",
            R.drawable.kuwait,
            "Jordan",
            "Kuwait",
            "Mali",
            "Sudan",
            2)
        questionList.add(que5)

        return questionList
    }

}