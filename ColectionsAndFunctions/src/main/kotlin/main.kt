//Collections
// List, Set, Map

fun main() {
    val lst1 = listOf(1, 2, 3, 4)
    val lst2: List<Int> = listOf(1, 2, 3, 4)
    val lst3: MutableList<Int> = mutableListOf(1, 2, 3, 4)

    println("")
    println("=================================")
    println("List")
    println("")

    for (l in lst2){
        println(l)
    }

    println("")
    println("=================================")
    println("MutableList")
    println("")

    lst3.add(5)
    println(lst3[0])
    println(lst3.size)
    lst3.reverse()
    println(lst3)
    lst3.remove(3)
    println(lst3)
    lst3.removeAt(0)
    println(lst3)

    for (l in lst3){
        println(l)
    }

    lst3.clear()
    println(lst3)

    println("")
    println("=================================")
    println("Set")
    println("")

}