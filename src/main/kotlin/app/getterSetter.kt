package app

import data.BigNote
import data.Note

fun main() {
    /**
     * Getter = function untuk mengambil data properties
     * Setter = function untuk mengubah data properties
     */

    val judul = Note("Belajar Kotlin OOP")
    println(judul.title)

    println()

    judul.title = "Selamat Belajar Kotlin OOP"
    println(judul.title)

    println()

    val bigJudul = BigNote("Belajar Kotlin OOP")
    println(bigJudul.bigTitle)

}