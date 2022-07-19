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
        val convidado = Convite(idade = idade)

        if (!conviteValidations.maiorDeIdade(idade)) {
            return "Negado. Menores de idade não são permitidos."
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite? ")
        if(!conviteValidations.tipoValido(convidado.tipo)){
            return "Negado. Convite inválido"
        }

        convidado.cod = Console.readString("Qual o código do convite? ")
        if (conviteValidations.codigoValido(convidado.cod)) {
            convidado.cod = convidado.cod.lowercase()

            if (!conviteValidations.validaConvite(convidado)) {
                return "Negado. Convite inválido"
            }
            return "Welcome :)"
        }
        return "Negado. Convite inválido"
    }
}
