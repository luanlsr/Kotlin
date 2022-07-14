class Forma(val a: Int, val b: Int)
data class FormaData(val a: Int, val b: Int)

data class Address(var rua: String, var numero: String)

fun address(e: Address){

    e.rua = " São Gonçalo"
    e.numero = "57"
}


fun main() {
    var f1: FormaData = FormaData(10, 8)
    var f2: FormaData = FormaData(10, 8)
    f1.equals(f2)
    println(f1.toString())
    println(f1.hashCode())
    println("----------------")
    println(f2.equals(f2))
    println(f2.toString())
    println(f2.hashCode())

}