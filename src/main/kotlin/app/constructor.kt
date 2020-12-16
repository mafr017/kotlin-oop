package app

import data.Car

fun main() {
    val Honda = Car("Honda", 2019)
    val Avanza = Car("Avanza")

    println(Honda.brand + " " + Honda.year)
    println(Avanza.brand + " " + Avanza.year)

    println()

    Avanza.year = 2018
    println(Avanza.brand + " " + Avanza.year)
}
