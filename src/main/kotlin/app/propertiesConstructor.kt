package app

import data.User

fun main() {
    /**
     * membuat properties di constructor hanya bisa di primary saja
     */

    val user1 = User("adit", "password")
    println(user1.username + " " + user1.password)
    println()

    val user2 = User("acil", "katasandi")
    println(user2.username + " " + user2.password)
    println()

    user1.username = "M Aditya FR"
    user1.password = "katakunci"
    println(user1.username + " " + user1.password)
}