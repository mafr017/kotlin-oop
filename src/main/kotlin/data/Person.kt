package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, My Name is $firstName")
    }

    fun run() {
        println("Lets Runnnn!")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }
}