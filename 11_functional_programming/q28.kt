fun productOfList(numbers: List<Int>): Int {
    return numbers.fold(1) { acc, number -> acc * number }
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val product = productOfList(numbers)
    println("Product: $product") // Выведет: Product: 120
}
