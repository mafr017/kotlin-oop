package Program

import annotations.Fancy

@Fancy(author = "Aditya")
class MyApplication(val name: String, val version: Int) {

    fun info(): String = "Application $name-$version"

}