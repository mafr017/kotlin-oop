package app

import data.Game
import data.Login
import data.login
import data.minmax


fun main() {
    /** Desctructuring Declarations
     * membuat multiple variables dari sebuah object
     * tidak bisa dilakukan untuk semua object, hanya object yang memiliki function componentX() yang bisa dilakukan
     * saat membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah parameternya
     */
    val game = Game("Stardew Valley", 75_000)
    val (name, price) = game
    println(name)
    println(price)

    /** Desctructuring di Function
     * bisa mengembalikan multiple return value pada function
     */
//    val result = minmax(5,3)
//    val min = result.min
//    val max = result.max
    val (min, max) = minmax(5, 3)
    println(min)
    println(max)

    /** Underscore " _ " untuk Variable Tidak Digunakan
     * untuk menghiraukan suatu variable, bisa menggunakan kata kunci " _ " underscore
     */
    val (min1, _) = minmax(6, 11)
    println(min1)

    /** Desctructuring Lambda Parameter
     * bisa mempermudah saat mengakses data yang ada di parameter
     */
    val login = Login("Aditya", "password")
    //manual
    /*login(login){ login ->
        login.user == "Aditya" && login.pass == "password"
    }*/
    login(login){ (user, pass) ->
        user == "Aditya" && pass == "password"
    }
    //gak paham asli bagian ini ^

}