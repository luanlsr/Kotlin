import kotlin.math.min

fun main() {
    val data = geraDados()

//    any / count
    println("Tenho dados? ${if (data.any()) "Sim!" else "Não!"}")
    println("Tenho ${data.count()} elementos")

// first / last
    println("Primeira receita: ${data.first().nome}")
    println("Última receita: ${data.last().nome}")

    println(listOf<Int>().firstOrNull())
    // retorna primeiro se tiver elemento

    println(listOf<Int>().lastOrNull())
    // retorna último se tiver elemento

// sum/ sumOf
    println(listOf(1,2,3,4).sum())

    println("${data.sumOf {it.calorias}} calorias totais")

// filter
    println(data.filter { it.nome.equals("Lasanha") }[0].nome)
    println(data.filter { it.nome == "Lasanha" }[0].nome)

    println("======================================")
    data.filter { it.calorias > 500 }.forEach({ println(it.nome)})

    println(data.count { it.nome.startsWith("p", true) })
    println(data.count { it.calorias > 500 })

// take / takeLast
    println("=====================")
    println(data.take(2)) // duas primeiras
    println(data.takeLast(2)) // duas últimas

// forEach
    println("")
    println("=====================")

    data.forEach { println("Receita de ${it.nome}") }

// max / min
    println("")
    println("=====================")

    println(data.minOf { it.nome })
    println(data.maxOf { it.nome })
    println(data.minOf { it.calorias })
    println(data.maxOf { it.calorias })

    println(listOf(1,4,9).minOf { it })
    println(listOf(1,4,9).minOrNull())
    println(listOf(1,4,9).minOfOrNull(){it})

    println(listOf(1,4,9).maxOf { it })
    println(listOf(1,4,9).maxOrNull())
    println(listOf(1,4,9).maxOfOrNull(){it})

    println("A receita de maior quantidade de calorias é de ${data.maxByOrNull { it.calorias }?.nome}")
    println("A receita de menor quantidade de calorias é de ${data.minByOrNull { it.calorias }?.nome}")

// map
    println("")
    println("=====================")

    println(data.map { it.nome })
    println(data.map { it.calorias }.sum())

// average
    println("")
    println("=====================")

    println(listOf(8.5f, 8f, 10f).average())

// distinct / sorted / reversed
    println("")
    println("=====================")
    val listDistinct = listOf(1,4,5,6,3,2,8,1,1,1,1,3,3)

    println(listDistinct)
    val a = listDistinct.distinct()
    val b = a.sorted()
    val c = b.reversed()

    val d = a.sortedDescending()

    println(a)
    println(b)
    println(c)
    println(d)

    println("")
    println("=====================")

    println(data.distinctBy { it.nome })
}


fun geraDados(): List<Receita>{
    return listOf(
        Receita("Lasanha", 1200,
            listOf(
                Ingredientes("Queijo", 5),
                Ingredientes("Presunto", 5),
                Ingredientes("Macarrão de Lasanha", 10),
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )
}


data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)
