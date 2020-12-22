package app

import data.Application
import data.Employee
import java.util.function.BooleanSupplier

typealias Aplikasi = Application
typealias App = Aplikasi
typealias pegawai = Employee

typealias StringSupplier = () -> String

//fun sayHello(supplier: () -> String) {
fun sayHello(supplier: StringSupplier) {
    println("Hello ${supplier()}")
}

fun main() {
    /** Type Alias
     * membuat nama berbeda dari tipe data yang telah ada
     * digunakan ketika ada tipe data dengan nama yang sama,
     * atau untuk mempersingkat nama tipe data tersebut
     * bisa juga digunakan untuk Function
     */
    val app = Aplikasi("Kotlin App")
    println(app.name)
    val apss = App("Kotlin App 2")
    println(apss.name)

    val pgw = pegawai("Aditya")
    pgw.sayHello("Osamu")

    sayHello { "adit" }
}