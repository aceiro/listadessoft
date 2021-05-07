package com.unicep.app.listadessoft.lista

import com.unicep.app.listadessoft.lista.Aggregation.*

class Aggregation{
    class Library{
        fun addBook(books: Books){
            val listOfBooks = arrayListOf<Books>()
            listOfBooks.add(books)
        }
    }

    class Books{}
}

fun main(){
    println("Library = ${Library().addBook(Books())}")
}