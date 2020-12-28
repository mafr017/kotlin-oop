package data

class Account {
    val name: String by lazy {
        println("Lazy called")
        println("kotlin oop")
        "kotlin"
    }
}