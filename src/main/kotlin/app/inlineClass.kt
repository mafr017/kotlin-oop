package app

import data.Token

fun main() {
    /** Inline Class
     * mengubah class menjadi inline dengan menggunakan kata kunci " inline "
     * properties harus diisi satu saja
     * terlalu banyak class akan memakan memory yang lebih banyak ketika program berjalan
     */
    val token = Token("oSdfghvKJnf")
    println(token.toUpper())
    println(token.toLower())
}