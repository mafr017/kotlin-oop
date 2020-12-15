package app

import data.Person

fun main() {
    val adit = Person()
    adit.firstName = "M Aditya"
    adit.middleName = "Fathur"
    adit.lastName = "Rahman"

    val fisher = Person()
    fisher.firstName = "Fisher"
    fisher.middleName = "Player"
    fisher.lastName = "Valorant"

    val killjoy = Person()
    killjoy.firstName = "Killjoy"
    killjoy.middleName = "Agent"
    killjoy.lastName = "Valorant"

    println(adit.firstName + " " + adit.middleName + " " + adit.lastName)
    println(fisher.firstName + " " + fisher.middleName + " " + fisher.lastName)
    println(killjoy.firstName + " " + killjoy.middleName + " " + killjoy.lastName)
}