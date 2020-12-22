package app

import data.Application
import data.Utilities

fun main() {
    /** Single Object
     * salah satu konsep Design Pattern
     * object yg hanya dibuat satu kali
     * menggunakan kata kunci " object "
     * mirip dengan class, bisa extends class ataupun interface
     * tetapi tidak memiliki constructors
     * rata" digunakan untuk membuat helper class / utilities class
     */
    println(Utilities.name)
    println(Utilities.toUpper("Aditya"))

    Utilities.name = "Dirubah"
    aUtil()
    bUtil()
    bUtil()
    aUtil()

    /** Inner Object
     * singleton object bisa dibuat didalam sebuah class
     * inner class, singleton object tidak bisa mengakses properties atau function yang ada di outer class nya
     */
    println(Application.Utilities.toUpper("M Aditya fr"))

}

fun aUtil(){
    println("a " + Utilities.name)
}

fun bUtil(){
    println("b " + Utilities.name)
    Utilities.name = "Dirubah 2"
}