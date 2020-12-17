package data

class Note(title: String) {

    var title: String = title
        get() {
            println("Call Getter Function")
            return field
        }
        set(value) {
            println("Call Setter Function")
            if(value.isNotBlank()) {
                field = value
            }
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.toUpperCase()
}