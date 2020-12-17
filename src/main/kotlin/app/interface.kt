package app

import data.Human

fun main() {
    /** Interface
     * adalah blueprint, prototype atau cetakan
     * berbeda dengan Class, Interface tidak bisa langsung dibuat sebagai Object
     * hanya bisa diturunkan dan digunakan sebagai kontrak untuk class-class turunannya
     * secara standar semua properties dan function adalah abstract
     */

    val human = Human("Aditya")
    human.sayHello("Kotlin")

    /** Concrate Function di Interface
     * function di interface memiliki pengecualian, tidak harus abstract
     * fucntion tersebut tidak wajib dibuat ulang di class child nya
     */

    /** Multiple Inheritance dengan Interface
     * inheritance di class hanya boleh memiliki satu class parent
     * tetapi di interface, inheritance bisa memiliki banyak interface parent
     */

    /** Inheritance antar Interface
     * interface bisa melakukan inheritance dengan interface lain
     * tetapi interface tidak bisa melakukan inheritance dengan class
     */

    human.go()
    human.move()
}
