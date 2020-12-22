package app

import data.Boss

fun main() {
    /** Inner Class
     * membuat class di dalam class (outer)
     * namun tidak bisa diakses satu sama lain
     * dengan menggunakan kata kunci " inner " maka class bisa mengakses class Outer
     */

    val atasan = Boss("Aditya")

    val pegawai = atasan.Employee("Osamu")
    pegawai.sayHi()

    val pegawai2 = atasan.Employee("Dazai")
    pegawai2.sayHi()
}