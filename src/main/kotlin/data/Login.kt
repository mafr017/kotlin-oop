package data

data class Login(val user: String, val pass: String)
//menggunakan alias
/*typealias LoginCallback = (Login) -> Boolean

fun login(login: Login, callback: LoginCallback): Boolean {
    return callback(login)
}*/

//tanpa alias
fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}