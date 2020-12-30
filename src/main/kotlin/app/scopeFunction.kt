package app

import data.Student

fun main() {
    /** Scope Function
     * kotlin memiliki standar library yang berisikan beberapa function yang bisa digunakan untuk mengeksekusi object...
     * dengan mudah dengan memanfaatkan lambda expression
     * function tersebut adalah let, run, with, apply, & also
     */
    /* Let Function
    - digunakan sebagai reference block agar kita bisa lebih mudah ketika memanipulasi sebuah object
    - memiliki parameter object itu sendiri, sehingga kita bisa menggunakan kata kunci " it " untuk mendapatkan...
    referensi terhadap object tersebut
     */
    val student = Student("Aditya", 17)
//    println(student.name)
//    println(student.age)
    student.let {
        println(it.name)
        println(it.age)
    }

    val result: String = student.let {
        "Name ${it.name}, age ${it.age}"
    }
    println(result)
    println()


    /* Run Function
    - mirip dengan let function
    - yang membedakan, pada run function tidak ada parameter pada lambda nya, sehingga tidak bisa mengakses...
    reference object menggunakan kata kunci " it " namun masih bisa menggunakan kata kunci " this "
     */
    student.run {
        println(this.name)
        println(this.age)
    }
    val result2: String = student.run {
        "Name ${this.name}, age ${this.age}"
    }
    println(result2)
    println()


    /* Apply Function
    - mirip dengan run function
    - yang membedakan, return value dari apply function ada reference object itu sendiri
     */
    val result3: Student = student.apply {
        "Name ${this.name}, age ${this.age}"
    }
    println(result3)
    println()


    /* Also Function
    - mirip dengan let function
    - yang membedakan, return value nya reference ke object itu sendiri
     */
    val result4: Student = student.also {
        "Name ${it.name}, age ${it.age}"
    }
    println(result4)
    println()


    /* With Function
    - mirip dengan run function, menggunakan reference this
    - yang membedakan, bukan extension function, jadi tidak bisa digunakan langsung dari object nya
    - harus memanggil with function secara manual
     */
    val result5: String = with(student) {
        "Name ${this.name}, age ${this.age}"
    }
    println(result5)
    println()

}