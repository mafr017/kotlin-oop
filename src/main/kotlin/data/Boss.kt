package data

class Boss(val bossName: String) {

    inner class Employee(val name: String) {

        fun sayHi(){
            println("Hi, my name is $name, and my boss name is $bossName")
        }
    }
}