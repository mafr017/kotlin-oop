package app

import data.Account

fun main() {
    /** Observable Properties
     * kita bisa tahu properties, value sebelum dan value setelah ketika diubah
     */
    val akun = Account()
    akun.description = "Contoh"
    akun.description = "Diubah"
    akun.description = "Hello World"
}