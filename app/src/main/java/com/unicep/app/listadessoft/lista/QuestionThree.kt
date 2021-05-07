package com.unicep.app.listadessoft.lista

fun checkIfNumberIsOdd(number: Long): Boolean {
    if( (number % 2).toInt() == 0) return false
    return true
}

fun Long.checkIfNumberIsEven(): Boolean {
    // return !checkIfNumberIsOdd(number)
    return checkIfNumberIsOdd(this).not()
}

infix fun Long.printFormat(number: Long): Unit {
    println("Number format {$number}")
}


fun main(){
    println("** checkIfNumberIsOdd **")
    println(checkIfNumberIsOdd(2))
    println(checkIfNumberIsOdd(3))
    println(checkIfNumberIsOdd(4))

    println("** checkIfNumberIsEven **")
    println(2.toLong().checkIfNumberIsEven())
    println(3.toLong().checkIfNumberIsEven())
    println(4.toLong().checkIfNumberIsEven())

    val x: Long  = 100
    println(x.checkIfNumberIsEven())

    val y: Long  = (Math.random()*100).toLong()
    y.printFormat(y)
}