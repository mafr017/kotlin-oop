package app

import data.Address

fun main() {
    /**
     * tidak enak nya membuat primary constructor harus membuat default value
     */
    val address1 = Address("Jl. Cihanjuang", "Bandung")
    println("${address1.street}, ${address1.city}, ${address1.country}")
    println()

    val address2 = Address("Melwood", "Liverpool", "Inggris")
    println("${address2.street}, ${address2.city}, ${address2.country}")
}