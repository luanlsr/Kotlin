class Matematica{

    companion object ConstantesMatematicas{
        val PI = 3.1415
        val e = 2.71825
        // equivalente ao static
        // não precisa ser nomeado
        init {
            println("fui inicializado")
        }
    }

    object obj1 {
        val PI = 3.1415
        init {
            println("fui inicializado")
        }
    }
}

fun main() {
    println(Matematica.PI)
    println(Matematica.PI)
    println(Matematica.ConstantesMatematicas.e)

    println(Matematica.obj1.PI)

    var m = Matematica()
}