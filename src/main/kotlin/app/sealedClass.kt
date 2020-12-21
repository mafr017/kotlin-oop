package app

import data.Minus
import data.Operation
import data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when(operation) {
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    /** Sealed Class
     * jenis class yang didesain untuk inheritance
     * tidak bisa diinstansiasi menjadi object, secara standar merupakan abstract class
     * sangat cocok digunakan sebagai class parent
     */

    /** Sealed Class di When Expression
     * sangat cocok digunakan when expression
     * bisa membatasi hanya class turunannya saja yang perlu dicheck
     */

    println(operation(10, 5, Plus()))
    println(operation(10, 3, Minus()))

}