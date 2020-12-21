package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    /** Extension Properties
     * harus membuat getter dan setter nya
     */
    val siswa: Student? = Student("Aditya", 18)
    siswa.sayHello("Kotlin")
    println(siswa?.upperName)
}