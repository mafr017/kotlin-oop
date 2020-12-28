package app

import data.Account

fun main() {
    /** Lazy Properties
     * implementasi delegating di properties
     * lazy adalah standar library yang telah disediakan agar properties baru diinisialisasikan ketika properties itu diakese
     */
    val akun = Account()
    println(akun.name)
    println(akun.name)
    println(akun.name)

}