package app

import data.Cat
import data.Dog

fun main() {
    /** Abstract Properties & Function
     * wajib dibuat ulang di class child nya
     */

    val kucing = Cat()
    println(kucing.name)
    kucing.run()

    println()

    val anjing = Dog()
    println(anjing.name)
    anjing.run()
}