package Validations

import Entity.Convite

class ConviteValidations() {
    fun maiorDeIdade(idade: Int) = (idade >= 18)

    fun tipoValido(info: String?) = (info == "comum" || info == "premium" || info == "luxo")

    fun codigoValido(info: String?) = (info != null && info != "")

    fun validaConvite(convite: Convite) = when (convite.tipo){
        "comum" -> convite.cod.startsWith("xt")
        "premium", "luxo" -> convite.cod.startsWith("xl")
        else -> false
    }

//    fun validaEntradaPremiumLuxo(convite: Convite) = ((convite.tipo == "premium" || convite.tipo == "luxo") && convite.cod.startsWith("xl"))
}

