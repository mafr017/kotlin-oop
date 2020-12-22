package data

//enum class Gender {
//    MALE,
//    FEMALE
//}

enum class Gender(val descripton: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescription(){
        println(descripton)
    }
}