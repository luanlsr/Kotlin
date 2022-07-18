open class Eletronico(var marca: String){
    private fun corrente(ativo: Boolean){}
    fun ligar(){
        corrente(true)
        println("Ligado")
    }
    open fun desligar(){
        corrente(false)
        println("Desligado")
    }
}

class Computador (marca: String) : Eletronico(marca){
    fun save(){
        println("Salvo")
    }
    override fun desligar() {
        save()
        super.desligar()
    }

    fun save(a: Int){
        println("overload")
    }

    fun save(a: Int, b: Int){
        println("overload com 2 parâmetros")
    }
    fun save(a: Float){
        println("overload com novo tipo")
    }
}

fun main() {
    val c: Computador = Computador("Dell")

    c.ligar()
    c.desligar()
}