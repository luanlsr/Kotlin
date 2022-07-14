open class Eletronico(var marca: String){
    fun ligar(){
        println("Ligado")
    }
    fun desligar(){
        println("Desligado")
    }
}

class Computador (marca: String) : Eletronico(marca){

}

fun main() {
    var c: Computador = Computador("Dell")
    c.ligar()
    c.desligar()
}