fun sumNullableList(numbers: List<Int>?): Int {
    return numbers?.sum() ?: 0
}

fun main() {
    val numbers: List<Int>? = listOf(1, 2, 3, 4, 5)
    println("Sum: ${sumNullableList(numbers)}") // Выведет: Sum: 15

    val emptyList: List<Int>? = null
    println("Sum: ${sumNullableList(emptyList)}") // Выведет: Sum: 0
}
