package data

data class MinMax(val min: Int, val max: Int)

fun minmax(value1: Int, value2: Int) : MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}
