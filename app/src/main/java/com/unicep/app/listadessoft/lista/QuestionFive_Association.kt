package com.unicep.app.listadessoft.lista


class Association {
    class Passengers {
        fun relatesAirplane(airplane: Airplane){
            println("Passenger has airplane = $airplane")
        }
    }

    class Airplane {
        fun relatesPassenger(passengers: Passengers){
            println("Airplane has passengers = $passengers")
        }
    }
}

fun main(){
    val passengers = Association.Passengers()
    val airplane = Association.Airplane()

    passengers.relatesAirplane(airplane)
    airplane.relatesPassenger(passengers)
}