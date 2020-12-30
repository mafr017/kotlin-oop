package app

import exception.ValidationException

fun validateAndSayHello(name: String) {
    if(name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    /** Exception
     * error direpresentasikan dengan Exception
     * dimana semua tipe data error pasti akan selalu class turunan dari throwable
     * untuk membuat error bisa menggunakan kata kunci throw, diikuti dengan object error nya
     */
    validateAndSayHello("Aditya")
//    validateAndSayHello("")
//    validateAndSayHello(" ")

    /** Try Catch
     * menangkap exception, lalu melakukan sesuatu jika terjadi error
     * TryCatch digunakan untuk mencoba melakukan sesuatu,
     * jika terjadi error maka akan ditangkap dan kita bisa memberi reaksi sesuai dengan yang kita mau
     */

    try {
        validateAndSayHello("Kotlin")
        validateAndSayHello("")
        println("Ini tidak akan muncul")
    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
    }

    /** Multiple Catch
     * menggunakan multiple block Catch, untuk menangkap jenis exception yang berbeda
     */
    try {
        validateAndSayHello("Kotlin")
        validateAndSayHello("")
        println("Ini tidak akan muncul")
    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi Error ${error.message}")
    }

    /** Finally
     * block kode yang bisa ditambahkan di TryCatch
     * block finally akan selalu dieksekusi setelah kode program Try Catch di eksekusi, baik itu sukses ataupun gagal
     * cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu kodenya sukses atau gagal
     */
    try {
        validateAndSayHello("Kotlin")
        validateAndSayHello("")
        println("Ini tidak akan muncul")
    } catch (error: ValidationException) {
        println("Terjadi Error ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}