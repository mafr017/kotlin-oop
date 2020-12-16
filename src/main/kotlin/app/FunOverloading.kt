package app

import data.Person

fun main() {
    /** Function Overloading
     * kemampuan membuat funtion dengan nama yang sama di dalam class
     * wajib menggunakan parameter yang berbeda (tipe parameter/jumlah parameter)
     */

    val org1 = Person()
    org1.firstName = "Aditya"

    org1.sayHello("Kotlin")
    org1.sayHello("Osamu", "Dazai")
}