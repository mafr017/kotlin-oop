package app

data class Friend(val name: String)

fun sayHellOO(friend: Friend?) { //tanpa if
    println("Hello ${friend?.name}")
}

fun sayHello(friend: Friend?) {
    if(friend != null) {
        println("Hello ${friend.name}")
    }
}

fun elvissayHelllo(friend: Friend?) {
    val name = friend?.name ?: ""
    println("Hello $name")
}

fun main() {
    /** Null Safety
     * cara untuk terhindar dari error null (secara explisit menggunakan tanda tanya " ? ")
     */
    sayHellOO(Friend("Aditya"))
    sayHellOO(null)
    println("~~~~~~~~~~~~~~~~~~~~~~~~")
    sayHello(Friend("Aditya"))
    sayHello(null)
    println("~~~~~~~~~~~~~~~~~~~~~~~~")

    /** Menggunakan Elvis Operator
     */
    elvissayHelllo(Friend("Aditya"))
    elvissayHelllo(null)

}