class Receita{
    lateinit var instrucoes: String

    fun gerarReceita(){
        instrucoes = "Lave as mãos"
    }

    fun imprimiReceita(){
        if(!this:: instrucoes.isInitialized){
            instrucoes = "Lave as mãos"
        }
    }
}

fun main() {
    var r: Receita = Receita()
    r.gerarReceita()
    r.imprimiReceita()
    println(r.instrucoes)
}