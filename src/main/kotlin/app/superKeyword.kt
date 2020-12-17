package app

import data.Rectangle

fun main() {
    /** Super keyword
     * mengakses function or properties milik class parent
     */
    val persegi = Rectangle()
    println("Corner ${persegi.corner}")
    println("Parent Corner ${persegi.parentCorner}")
    persegi.printName()

    println()

    val segitiga = Rectangle()
    segitiga.printName()
}