package com.unicep.app.listadessoft.lista

class Multiplicity{
    class Passengers{
        var passengerId: Int? = null
        /* others fields */
    }

    class Airplane{
        var airplaneId: String? = null
        /* others fields */

        val listOfPassengers = arrayListOf<Passengers>()

        fun addPassenger(passengers: Passengers){
            listOfPassengers.add(passengers)
        }
    }
}

fun main(){
    val passengers = Multiplicity.Passengers()
    val airplane = Multiplicity.Airplane()

    airplane.addPassenger(passengers)
    println("airplane :: ${airplane.listOfPassengers}")
}
