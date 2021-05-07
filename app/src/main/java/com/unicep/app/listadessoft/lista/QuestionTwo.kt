package com.unicep.app.listadessoft.lista

// Q2
import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NumberFormatException

fun sum(x: Int, y: Int): Int {
    return x+y
}

fun sub(x: Int, y: Int) = x-y

fun multi(x: Int, y: Int) = x*y

fun div(x: Int, y: Int) : Int {
    return try {
         x/y
    }catch (e: Exception){
        println("Error :: ${e.message}")
        -1
    }
}

fun main(){
    val x = 10
    val y = 2
    println("Calculator")
    println("Sum = ${sum(x,y)}")
    println("Subtract = ${sub(x,y)}")
    println("Product = ${multi(x,y)}")
    println("Div = ${div(x,y)}")
    println("Div = ${div(x,0)}")
}

