package app

import data.Car

fun main() {
    val Honda = Car("Honda", "red", 2019)
    val Avanza = Car("Avanza", "red")

    println(Honda.brand + " " + Honda.year)
    println(Avanza.brand + " " + Avanza.year)

    println()

    Avanza.year = 2018
    println(Avanza.brand + " " + Avanza.year)
}
