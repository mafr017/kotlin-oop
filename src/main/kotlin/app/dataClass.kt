package app

import data.Product

fun main() {
    /** Data Class
     * class yg secara otomatis akan membuatkan function equals, hashCode, toString, dan copy
     * dari semua preperties yg ada di primary constructor yg dimiliki oleh data class
     */
    val produk = Product("Pocky", 7500, "Snack")
    println(produk)

    /** Copy Data Class
     * untuk menduplikasi object sekaligus mengubah properti nya
     */

    val produk2 = produk.copy()
    println(produk2)

    val produk3 = produk.copy(name = "Chacha", price = 2500)
    println(produk3)
}