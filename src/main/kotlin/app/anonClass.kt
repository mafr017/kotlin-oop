package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}

class sampleAction : Action {
    override fun action() {
        println("This is sample action!")
    }
}

fun main() {
    fireAction(sampleAction())

    /** Anonymous Class
     * kotlin mendukung pembuatan object dari class yang belum lengkap
     * kotlin juga bisa membuat object dari interface
     * untuk membuat anonymous class, gunakan kata kunci object diikuti dengan deklarasi class child seperti pada pewarisan
     */
    fireAction(object : Action {
        override fun action() {
            println("Action One!")
        }
    })
    fireAction(object : Action {
        override fun action() {
            println("Action Two!")
        }
    })
    fireAction(object : Action {
        override fun action() = println("Action Three!")
    })
}