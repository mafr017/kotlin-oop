package data

interface Base {
    fun sayHello(name: String)
}

class MyBase : Base{
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

// delegate manual
class MyBaseDelegate(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name)
    }
}

class BaseDelegateMinimal(val base: Base) : Base by base