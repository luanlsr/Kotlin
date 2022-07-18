interface Funcionario{
    var salario: Float
    fun bonus(): Float
}

//abstract class Funcionario(var salario: Float){
//    abstract fun bonus(): Float
//}

//class Gerente(salario: Float) : Funcionario(salario) {
//    override fun bonus(): Float {
//        return salario * 0.5f
//    }
//}

class Gerente(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}


class Analista(override var salario: Float) : Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(f: Funcionario){
    println(f.bonus())
}


fun main() {
    mostraBonus(Analista(3500f))
}