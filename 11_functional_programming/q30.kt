fun <T> customFilter(list: List<T>, predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (item in list) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = customFilter(numbers) { it % 2 == 0 }
    println(evenNumbers) // Выведет: [2, 4, 6]
}
