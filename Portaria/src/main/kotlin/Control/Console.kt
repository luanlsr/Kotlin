package Control

class Console private constructor(){
    companion object {
        fun readInt(msg: String): Int{

            var retorno: Int? = null
            do {
                println(msg)
                val info = readLine()
                if (info != null && info != ""){
                    retorno = info.toIntOrNull()
                    if (retorno == null) {
                        println("Valor inválido")
                    }else if (retorno <= 0){
                        println("Idade deve ser maior que zero")
                    }
                }
            } while (retorno == null || retorno <= 0)

            return retorno
        }

        fun readString(msg: String): String{
            var retorno: String? = null
            do {
                println(msg)
                val info = readLine()

                if (info != null && info != ""){
                    retorno = info.toLowerCase()
                }else {
                    println("Valor inválido")
                }
            } while (retorno == null)

            return retorno
        }
    }
}