package app

import data.Application

fun main() {
    /** Companion Object
     * kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
     * secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama class nya
     */
    Application.sayHello("Aditya")
}