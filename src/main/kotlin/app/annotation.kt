package app

import Program.MyApplication

fun main() {
    /** Annotation
     * menambahkan metadata ke kode program yang kita buat
     * biasanya digunakan saat kita ingin membuat library / framework
     * bisa diakses menggunakan Reflection
     * menggunakan kata kunci " annotation " sebelum membuat class tersebut
     * hanya boleh memiliki properties via primary constructor, tidak boleh memiliki members lainnya (function / properties di body)
     */
    /* Attribute Annotation
    Attribute           ||  Keterangan
    @Target             ||  Memberitahu annotation bisa digunakan di mana? Class, function, properties, dll.
    @Retention          ||  Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection?
    @Repeatable         ||  Memberitahu annotation apakah bisa digunakan lebih dari sekali di target yang sama?
    @MustBeDocumented   ||  Memberitahu annotation apakah perlu didokumentasikan di public API
     */
    val myaplikasi = MyApplication("Kotlin-OOP", 1)
    println(myaplikasi.info())

}