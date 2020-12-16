package app

import data.*

fun main() {
    /** Inheritance
     * kemampuan untuk menurunkan sebuah class ke class lain
     * class parent -> class child
     * tiap class child hanya bisa punya satu class parent
     */
    val manager = Manager("Aditya")
    manager.sayHello("Fisher")

    val vicePresident = VicePresident("Fathur")
    vicePresident.sayHello("Dazai")
}