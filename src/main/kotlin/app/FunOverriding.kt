package app

import data.Manager
import data.VicePresident

fun main() {
    /** Function Overriding
     * kemampuan membuat ulang function yang sudah ada di class parent
     * ketika function tidak ingin diturunkan lagi maka gunakan keyword " final "
     */
    val manager = Manager("Aditya")
    manager.sayHello("Fisher")

    val vicePresident = VicePresident("Fathur")
    vicePresident.sayHello("Dazai")
}