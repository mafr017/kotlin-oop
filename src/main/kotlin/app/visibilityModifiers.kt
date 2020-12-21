package app

import data.SuperTeacher
import data.Teacher

fun main() {
    /** Visibility Modifiers
     * Class, Interface, Function, dan Properties bisa memiliki visibility modifiers
     * 4 macam visibility modifiers : public, private, protected, internal
     * public    = bisa diakses dimana saja
     * private   = bisa diakses di tempat deklarasinya saja
     * protected = hanya bisa diakses di tempat deklarasi dan turunannya saja
     * internal  = hanya bisa diakses di module/project yang sama
     */

    val guru = Teacher("Adit")
    println(guru.name)
//    guru.teach()    // ERROR
    val superGuru = SuperTeacher("MAFR")
    superGuru.test()
}