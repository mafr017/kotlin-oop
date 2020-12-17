package app

import data.City
import data.Country
import data.Location

fun main() {
    /** Abstract Class
     * class yang tidak bisa dibuat sebagai object, hanya bisa diturunkan
     */

//    val location = Location("Cihanjuang")    // ERROR karna abstract class tidak bisa dibuat langsung menjadi object
    val city = City("Cimahi")
    val country= Country("Indonesia")

    println(city.name)
    println(country.name)
}