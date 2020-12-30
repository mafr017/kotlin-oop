package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    //iterate satu-persatu, lalu cek kalau ada annotation @NotBlank
    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    /** Reflection
     * kemampuan melihat struktur aplikasi pada saat berjalan
     * biasanya sangat berguna ketika ingin membuat library / framework, sehingga bisa meng-otomatasi pekerjaan
     * mengakses reflection class dari sebuah object,
     * menggunakan kata kunci " ::class " , atau bisa langsung dari NamaClass::class
     */
    val barang1 = CreateProductRequest("1", "Pocky", 7_500)
    validateRequest(barang1)

//    val barang2 = CreateProductRequest("", "Indomie", 2_500)    //error
//    validateRequest(barang2)

//    val barang3 = CreateProductRequest("3", "", 5000)   //error
//    validateRequest(barang3)


    val kategori1 = CreateCategoryRequest("S", "Snack")
    validateRequest(kategori1)

    val kategori2 = CreateCategoryRequest("", "Drink")  //error
    validateRequest(kategori2)

//    val kategori3 = CreateCategoryRequest("A", "")    //error
//    validateRequest(kategori3)
}