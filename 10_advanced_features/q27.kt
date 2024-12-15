fun sumOfIntegers(vararg numbers: Int): Int {
    return numbers.sum()
}

fun main() {
    val sum = sumOfIntegers(1, 2, 3, 4, 5)
    println("Sum: $sum") // Выведет: Sum: 15
}
