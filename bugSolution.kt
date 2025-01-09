fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeAll { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeAll { it > 2 }
    println(set) // Output: [1, 2]
} 