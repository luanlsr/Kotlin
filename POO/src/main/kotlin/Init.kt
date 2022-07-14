class Animal(var especie: String){
    var fala: String? = null
//    init{
//        if (especie.toLowerCase() == "cachorro"){
//            fala = "auau"
//        }else if (especie.toLowerCase() == "gato"){
//            this.fala = "miau"
//        } else {
//            fala = "Não sei"
//        }
//    }

//    get(){
//        return field
//    }
//
//    set(value){
//        field = value + "!"
//    }
//
    fun falar(){
        println(fala)
    }
}

fun main() {
    val animal: Animal = Animal("GATO")
    Planeta().nome = "Terra"
    animal.falar()
    animal.fala
}