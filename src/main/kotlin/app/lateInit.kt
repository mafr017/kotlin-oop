package app

import data.Television

fun main() {
    /** Late-Initialized Properties
     * menunda inisialisasi data para properties, menggunakan kata kunci " lateinit "
     * bisa membuat properties tanpa harus langsung mengisi datanya
     * hanya bisa digunakan di var (mutable data)
     */

    val tv = Television()
    tv.brand = "LG"
    println(tv.brand)

    println()

    tv.initTv("TOSHIBA")
    println(tv.brand)

}