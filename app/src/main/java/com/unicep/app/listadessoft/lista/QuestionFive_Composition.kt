package com.unicep.app.listadessoft.lista

import com.unicep.app.listadessoft.lista.Aggregation.*

class Composition{
    class Library{
        private val listOfBooks = arrayListOf<Books>()
        fun addBook(books: Books){
            listOfBooks.add(books)
        }
    }

    class Books{}
}

fun main(){
    println("Library = ${Library().addBook(Books())}")
}