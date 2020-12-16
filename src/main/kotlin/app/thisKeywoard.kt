package app

import data.Person

fun main() {
    /** This Keywoard
     * digunakan untuk mereferensikan object saat ini
     * hanya bisa digunakan di dalam class itu sendiri
     * digunakan untuk mengakses properties yang tertutup oleh parameter dengan nama yang sama
     */

    val org1 = Person()
    org1.firstName = "Aditya"

    org1.sayHello("Osamu", "Dazai")
}