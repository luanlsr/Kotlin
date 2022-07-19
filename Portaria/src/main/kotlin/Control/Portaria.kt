package Control

import Entity.Convite
import Validations.ConviteValidations

class Portaria {

    private val conviteValidations = ConviteValidations()
    init {
        println("Portaria inicializada")
        println("====================================================")
        println("")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade? ")
        if (!conviteValidations.maiorDeIdade(idade)) {
            return "Negado. Menores de idade não são permitidos."
        }

        val tipoConvite = Console.readString("Qual é o tipo de convite? ")
        if(!conviteValidations.tipoValido(tipoConvite)){
            return "Negado. Convite inválido"
        }

        var codigo = Console.readString("Qual o código do convite? ")
        if (conviteValidations.codigoValido(codigo)) {
            codigo = codigo.lowercase()
            val convite = Convite(tipoConvite, codigo)

            if (!conviteValidations.validaConvite(convite)) {
                return "Negado. Convite inválido"
            }
            return "Welcome :)"
        }
        return "Negado. Convite inválido"
    }
}
