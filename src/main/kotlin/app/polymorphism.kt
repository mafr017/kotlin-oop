package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    /** Polymorphism
     * kemampuan sebuah object berubah bentuk menjadi bentuk lain
     * erat hubungannya dengan Inheritance
     */
    var employee: Employee = Employee("Aditya")
    employee.sayHello("Kotlin")

    employee = Manager("Adit")
    employee.sayHello("Osamu")

    employee = VicePresident("MAFR")
    employee.sayHello("Dazai")
}