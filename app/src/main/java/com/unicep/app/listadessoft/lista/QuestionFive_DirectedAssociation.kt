package com.unicep.app.listadessoft.lista


class DirectedAssociation {

    class Passengers

    class Airplane {
        fun hasPassengers(passengers: Passengers) {
            println("Airplane has passengers = $passengers")
        }
    }
}

fun main(){
    val passengers = DirectedAssociation.Passengers()
    val airplane = DirectedAssociation.Airplane()

    airplane.hasPassengers(passengers)
}