package app

import data.BaseDelegateMinimal
import data.MyBase
import data.MyBaseDelegate

fun main() {
    /** Delegation
     * merupakan design pattern
     * meneruskan properties atau function ke object yang lain
     */
    val base = MyBase()
    base.sayHello("Aditya")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Kotlin")

    val baseDelegateMinimal = BaseDelegateMinimal(base)
    baseDelegateMinimal.sayHello("Dazai")

}