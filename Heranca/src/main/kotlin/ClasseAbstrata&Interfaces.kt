interface Selvagem {
    fun atacar()
}

abstract class Mamifero(val nome: String){
    fun acordar(){}
    fun dormir(){}

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome), Selvagem{
    override fun falar() {
        TODO("Not yet implemented")
    }

    override fun atacar() {
        TODO("Not yet implemented")
    }

// classe abstrata deve implementar os métodos
// não pode ser instanciada
}

fun main() {

}