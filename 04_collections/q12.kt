fun filterAndSortOddNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 != 0 }.sortedByDescending { it }
}

fun main() {
    val numbers = listOf(5, 8, 3, 9, 2, 6, 7)
    val sortedOdds = filterAndSortOddNumbers(numbers)
    println("Sorted odd numbers: $sortedOdds")
}
