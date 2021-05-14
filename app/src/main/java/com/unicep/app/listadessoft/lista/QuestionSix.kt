package com.unicep.app.listadessoft.lista

class QuestionSix {

    fun checkNumbers(state: Int){
        when(state){
            10 -> println("Showing number 10!")
            20 -> println("Showing number 20!")
            else -> println("Showing otherwise number!")
        }
    }

    fun checkNumbersFromList(list: ArrayList<Int>){
        for (i in list){
            checkNumbers(i)
        }
    }

}


fun main(){
    val question = QuestionSix()
    // sample #1
    println("// sample #1")
    question.checkNumbers(10)
    question.checkNumbers(20)
    question.checkNumbers(30)


    // sample #2
    println("// sample #2")
    val myListOfItems = arrayListOf(1, 2, 3, 4, 5, 10)
    question.checkNumbersFromList(myListOfItems)


    // sample #3
    println("// sample #3")
    for (i in 0..100) {
        question.checkNumbers(i)
    }


    // sample #4
    println("// sample #4")
    for (i in 0..100 step 10) {
        question.checkNumbers(i)
    }

    // sample #5
    println("// sample #5")
    for (i in 100 downTo  1) {
        question.checkNumbers(i)
    }

}