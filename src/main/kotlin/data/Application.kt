package data

class Application(val name: String) {

    companion object {
        fun sayHello(name: String): Unit {
            println("Hello $name")
        }
    }

    object Utilities {
        fun toUpper(name: String): String {
            return name.toUpperCase()
        }
    }
}