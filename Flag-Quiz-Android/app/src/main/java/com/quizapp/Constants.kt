package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "From which country is this flag?",
            R.drawable.ic_flag_of_poland,
            "Monaco", "Poland",
            "Indonesia", "Singapore", 2
        )
        questionsList.add(que1)


        // 2
        val que2 = Question(
            2, "From which country is this flag :) ?",
            R.drawable.ic_flag_of_spain,
            "Catalonia", "France",
            "Spain", "Andorra", 3
        )

        questionsList.add(que2)


        // 3
        val que3 = Question(
            3, "From which country is this flag?",
            R.drawable.ic_flag_of_portugal,
            "Italy", "Hungary",
            "Brazil", "Portugal", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "From which country is this flag?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "From which country is this flag?",
            R.drawable.ic_flag_of_estonia,
            "Finland", "Norway",
            "Estonia", "Armenia", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "From which country is this flag?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "From which country is this flag?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "From which country is this flag?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "From which country is this flag?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionsList.add(que9)


        // 10
        val que10 = Question(
            10, "From which country is this flag?",
            R.drawable.ic_flag_of_italy,
            "Italy", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        return questionsList
    }
    // END
}
// END