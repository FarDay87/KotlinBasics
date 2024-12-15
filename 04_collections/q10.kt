fun findMinMax(numbers: List<Int>): Pair<Int, Int> {
    val min = numbers.minOrNull() ?: error("List is empty")
    val max = numbers.maxOrNull() ?: error("List is empty")
    return Pair(min, max)
}

fun main() {
    val numbers = listOf(5, 2, 9, 1, 7, 6)
    val (min, max) = findMinMax(numbers)
    println("Min: $min, Max: $max")
}
