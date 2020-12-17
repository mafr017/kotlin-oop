package app

import data.Company

fun main() {
    /** Equals Function
     * semua object bisa dibandingkan menggunakan == atau !=
     * ketika membandingkan object sebenarnya menggunakan function equals milik Class Any
     * untuk mengubah cara membandingkannya, bisa meng-override function equals milik class any
     */

    val company1 = Company("Adit")
    val company2 = Company("Aditya")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}