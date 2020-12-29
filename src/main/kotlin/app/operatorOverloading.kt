package app

import data.Fruit

fun main() {
    /** Operator Overloading
     * bisa membuat function dari operator-operator seperti operator matematika
     * bisa melakukan operasi apapun di object seperti layaknya tipe data Integer
     * harus ada kata kunci sebelum declarator
     */
    /*------Unary Prefix Operator----------
    Expression          Translated to
    +a                  a.unaryPlus()
    -a                  a.unaryMinus()
    !a                  a.not()
    --------Increment & Decrement----------
    a++                 a.inc()
    a--                 a.dec()
    --------Aritmatika---------------------
    a + b               a.plus(b)
    a - b               a.minus(b)
    a * b               a.times(b)
    a / b               a.div(b)
    a % b               a.rem(b), a.mod(b) <- depracated
    a..b                a.rangeTo(b)
    --------In Operator--------------------
    a in b              b.contains(a)
    a !in b             !b.contains(a)
    --------Index Acces--------------------
    a[i]                a.get(i)
    a[i, j]             a.get(i, j)
    a[i_1, .., i_n]     a.get(i_1, .., i_n)
    a[i] = b            a.set(i, b)
    a[i, j] = b         a.set(i, j, b)
    a[i_1, .., i_n]=b   a.set(i_1, .., i_n, b)
    --------Invoke Operator----------------
    a()                 a.invoke()
    a(i)                a.invoke(i)
    a(i, j)             a.invoke(i, j)
    a(i_1, .., i_n)     a.invoke(i_1, .., i_n)
    --------Assignment Operator------------
    a += b              a.plusAssign(b)
    a -= b              a.minusAssign(b)
    a *= b              a.timesAssign(b)
    a /= b              a.divAssign(b)
    a &= b              a.remAssign(b), a.modAssign(b) <- deprecated
    --------Equality & Inequality----------
    a == b              a?.equals(b) ?: (b === null)
    a != b              !(a?.equals(b) ?: (b === null))
    --------Comparison Operator-----------
    a > b               a.compareTo(b) > 0
    a < b               a.compareTo(b) < 0
    a >= b              a.compareTo(b) >= 0
    a <= b              a.compareTo(b) <= 0
     */

    val buah1 = Fruit(100)
    val buah2 = Fruit(50)
    val buah3 = Fruit(70)
    val total = buah1 + buah2 + buah3
    println(total)

    println(buah1 - buah3 + Fruit(20))
}