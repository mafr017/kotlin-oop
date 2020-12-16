package data

class Car(paramBrand: String, paramColor: String, paramYear: Int = 2020) {

    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramColor: String) : this(paramBrand, paramColor, 2019) {
        println("Secondary Constructor-1")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Contructor-2")
    }

    var brand: String = paramBrand
    var color: String = paramColor
    var year: Int = paramYear
}