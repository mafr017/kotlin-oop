package app

import data.SmartPhone

fun main() {
    /** Any Class
     * semua class yang tanpa class parent = clas child dari class any
     * any = superclass untuk semua class yang dibuat di Kotlin
     */
    val smartPhone = SmartPhone("Asus ROG", "Android 11")
    println(smartPhone.toString())
    println(smartPhone.hashCode())
}