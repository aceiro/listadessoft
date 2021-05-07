package com.unicep.app.listadessoft.lista

fun max(x: Int, y: Int?): Int {
    if(x>(y?:-1)) return x
    return (y?:-1)
}

fun max2(x: Int, y: Int?): Int {
    if(x>(y!!)) return x
    return (y!!)
}


fun main(){
    var number: Int? /*Elvis Operator*/
    number = null

    println(number?.toLong())

    println(number!!.toLong())

    println(max(100,null))
    println(max2(100,null))
}