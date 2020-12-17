package app

import data.Duelist
import data.Sentinels

fun main() {
    /** Super Constructor
     * mengakses constructor class parent hanya bisa dilakukan di dalam constructor class child
     */
    val killjoy = Sentinels("Killjoy")
    println(killjoy.name + " " + killjoy.type)

    val jett = Duelist("Jett", "Female")
    println(jett.name + " " + jett.type + " " + jett.gender)
}