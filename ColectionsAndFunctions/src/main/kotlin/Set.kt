
fun main() {
    val set1 = setOf(1, 2, 3, 4)
    val set2: Set<Int> = setOf(1, 2, 3, 4)
    val set3: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 4)
    // não permite valores duplicados

    set3.add(9)
    set3.remove(3)
    println(set3.contains(2))
    


    println(set3)
}