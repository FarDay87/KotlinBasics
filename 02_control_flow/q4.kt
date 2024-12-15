fun factorial(n: Int): Int {
    return when {
        n == 0 || n == 1 -> 1
        else -> n * factorial(n - 1)
    }
}

fun main() {
    val number = 5
    println("Factorial of $number is: ${factorial(number)}")
}
