package app

import data.Car

fun main() {
    /** Secondary Constructor
     * kotlin mendukung pembuatan contructor > 1
     * saat membuat constructor, kita wajib memanggil primary constructor jika ada
     */
    val Kijang = Car("Kijang", "brown", 2015)
    println(Kijang.brand + " " + Kijang.color + " " + Kijang.year)
    println()

    val Honda = Car("Honda")
    println(Honda.brand + " " + Honda.year)
    println()

    val Avanza = Car("Avanza", "red")
    println(Avanza.brand + " " + Avanza.color)
}