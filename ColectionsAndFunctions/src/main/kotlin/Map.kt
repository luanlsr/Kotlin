fun main() {
    // obj = chave: valor
    val map1 = mapOf<String, String>(Pair("pais","França"))
    val map2 = mutableMapOf<String, String>(Pair("Bahia", "Salvador"))

//    println(map1)
//    println(map1.entries)
//    println(map1.keys)
//    println(map1.values)
//
//    println(map2)
    map2["Brasil"] = "Brasília"
//
//    println(map2)

    val listOfObj = listOf(map2)
    listOfObj.forEach({
        println(it.values)
    })
}