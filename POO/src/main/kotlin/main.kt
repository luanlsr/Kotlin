class Pessoa(var estadoCivil: String){
    var nome: String = ""
    var idade: Int = 0

    constructor(estadoCivil: String, documento: Int) : this(estadoCivil)

    fun dormir(){
        println("$nome vai dormir!")
    }
}

class Pessoas{
    var nome: String? = null
    var idade: Int = 0

    constructor()
    constructor(estadoCivil: String, nome: String) : this(){
        this.nome =  nome
    }

}

class Vazia private constructor()
// não consegue instanciar

fun main() {
//    Vazia()


    var pessoa: Pessoa = Pessoa("Solteiro", 21)
    var pessoa2: Pessoas = Pessoas()
    var pessoa3: Pessoas = Pessoas("Solteiro", "Luan")
    pessoa.nome = "Luan"
    println(pessoa.nome)
    pessoa.dormir()
}