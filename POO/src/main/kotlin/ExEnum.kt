enum class Prioridade(val value: Int) {
    Baixa(1){
        override fun toString(): String {
            return "Prioridade Baixa: $value"
        }
            },
    Media(5),
    Alta(15)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavelo, Vaca
}

fun imprimePrioridade(p: Prioridade){
    println(p)
}
fun imprimeAnimal(p: AnimalEnum){
    println(p)
}

fun main() {

    imprimePrioridade(Prioridade.Baixa)
    imprimePrioridade(Prioridade.Media)
    imprimePrioridade(Prioridade.Alta)

    imprimeAnimal(AnimalEnum.Cachorro)
    imprimeAnimal(AnimalEnum.Gato)
    imprimeAnimal(AnimalEnum.Cavelo)
    imprimeAnimal(AnimalEnum.Vaca)

    for (p in Prioridade.values()){
        println(p)
    }
}