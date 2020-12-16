package app

import data.Person

fun main() {
    val org1 = Person()
    org1.firstName  = "M Aditya"
    org1.middleName = "Fathur"
    org1.lastName   = "Rahman"

    org1.sayHello("Kotlin")
    println(org1.getFullName())
    org1.run()
}