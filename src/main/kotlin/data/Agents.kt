package data

open class Agents (val name: String, val type: String, val gender: String) {
    constructor(name: String, type: String) : this(name, type, "Female")
    constructor(name: String) : this(name, "Technology")
}

//menggunakan super constructor
class Sentinels : Agents {
    constructor(name: String) : super(name, "Technology")
    constructor(name: String, gender: String): super(name, "Technology", gender)
}

//menggunakan this
class Duelist(name: String, gender: String) : Agents(name, "Magic", gender) {
    constructor(name: String) : this(name, "Female")
}