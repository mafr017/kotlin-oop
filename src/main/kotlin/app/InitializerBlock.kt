package app

import data.Car

fun main() {
    //initializer block = blok kode yang akan dieksekusi ketika constructor dipanggil
    val Honda = Car("Honda", 2019)

    println(Honda.brand + " " + Honda.year)
}