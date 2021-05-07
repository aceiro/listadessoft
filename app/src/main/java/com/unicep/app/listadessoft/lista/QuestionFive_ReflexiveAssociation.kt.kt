package com.unicep.app.listadessoft.lista

class AirlineStaff {
    val staff = arrayListOf<AirlineStaff>()
    fun addStaff(airlineStaff: AirlineStaff){
        staff.add(airlineStaff)
    }
}

fun main(){
    val airlineStaff = AirlineStaff()
    println("airlineStaff :: $airlineStaff")
    println("staff :: ${airlineStaff.staff}")

    airlineStaff.addStaff(AirlineStaff())
    println("staff :: ${airlineStaff.staff}")
}