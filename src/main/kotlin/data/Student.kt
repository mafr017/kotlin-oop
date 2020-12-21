package data

class Student(val name: String, val age: Int) {
}

fun Student?.sayHello(name: String){
//    println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    if (this != null) {
        println("Hello $name, my name is ${this.name}, and my age is ${this.age}")
    }
}

val Student.upperName : String
    get() = this.name.toUpperCase()