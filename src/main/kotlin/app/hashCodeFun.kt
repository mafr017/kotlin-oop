package app

import data.Company

fun main() {
    /** HashCode Function
     * digunakan untuk sebagai representasi angka unit untuk object yang dibuat
     * berguna ketika mengkonversi object kita menjadi angka
     * sering dilakukan ketika di struktur data, untuk memastikan tida ada data duplicate, agar lebih mudah dicek nilai hashCode nya
     */

    val company1 = Company("Adit")
    val company2 = Company("Adit")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())

}