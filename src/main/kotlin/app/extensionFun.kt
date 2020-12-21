package app

import data.Student
import data.sayHello

fun main() {
    /** Extension Function
     * menambahkan funtion pada tipe data yang sudah ada
     * extension bukanlah function di Class, jadi tidak ada perubahan pada class aslinya
     */
    val siswa: Student? = Student("Aditya", 17)
    siswa.sayHello("Kotlin")

    /** Nuallable Extension Function
     * secara standar data extension function tidak nullable
     * jika ingin menjadikan nullable, harus menggunakan kata kunci " ? " tanda tanya
     */
}