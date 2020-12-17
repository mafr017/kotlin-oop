package app

import data.Laptop
import data.SmartPhone

fun printObject(any: Any) {
    //if cast is
    /*if (any is Laptop) {
        println("Laptop ${any.name}")
    } else if (any is SmartPhone) {
        println("Smartphone ${any.name} os ${any.os}")
    } else {
        println(any)
    }*/

    //when cast is
    when (any) {
        is Laptop -> println("Laptop ${any.name}")
        is SmartPhone -> println("Smartphone ${any.name} os ${any.os}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    // val value = any as String
    val value: String? = any as? String
    println(value)
}

fun main() {
    /** Type Check & Casts
     * pengecekan tipe data pada function dari sebuah class
     */

    printObject("Aditya")
    printObject(2020)
    printObject(Laptop("Lenovo"))
    printObject(SmartPhone("Xiaomi", "Android 11"))

    /** is & !is Operator
     * is digunakan untuk mengecek apakah sebuah data merupakan tipe data tertentu
     * !is digunakan untuk mengecek apakah sebuah data merupakan bukan tipe data tertentu
     */

    /** Smart Cast
     * mekanisme konversi data secara otomatis setelah melakukan pengecekan menggunakan is
     * setelah pengecekan is -> secara otomatis berubah menjadi tipe data yang di cek
     */

    /** Unsafe Casts
     * konversi tipe data secara paksa menggunakan kata kunci as
     * namun konversi menggunakan as sangat tidak aman jika ternyata tipe datanya tidak sesuai


    printString(2020) //ini akan error ClassCastException
    printString("Aditya")
    printString("Belajar Kotlin")
    */

    /** Safe Nullable Cast
     * penggunaan as menjadi aman dengan kata kunci " as? "
     * jika gagal melakukan konversi, secara otomatis akan diubah menjadi null
     */

    printString(2020) //ini akan error ClassCastException
    printString("Aditya")
    printString("Belajar Kotlin")
}