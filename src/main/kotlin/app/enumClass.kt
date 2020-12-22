package app

import data.Gender

fun main() {
    /** Enum Class
     * representasi dari class yang sudah tetap nilainya
     * digunakan untuk jenis data yang sudah baku (jenis kelamin, arah mata angin, dll.)
     * gunakan kata kunci " enum " sebelum deklarasi class
     * tidak bisa membuat object dari class enum
     * bisa mendeklarasikan langsung object yang tersedia untuk enum class
     */

    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    println(man) // ini belum dalam bentuk tipe string
    println(woman)  // ini belum dalam bentuk tipe string
    println(allGenders.toList())

    val manfromString = Gender.valueOf("MALE")
    val womanfromString = Gender.valueOf("FEMALE")

    println(manfromString)
    println(womanfromString)

    /** Properties & Function di Enum CLass
     * jika properties diset menggunakan constructor, maka saat pembuatan object enum wajib diisii
     * jika terdapat abstract function, maka wajib di override pada saat pembuatan object
     */
    man.showDescription()
    woman.showDescription()
}