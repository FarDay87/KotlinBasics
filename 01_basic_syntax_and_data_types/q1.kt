fun isPrime(number: Int): Boolean {
    return when {
        number < 2 -> false
        number == 2 -> true
        else -> {
            for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
                if (number % i == 0) return false
            }
            true
        }
    }
}

fun main() {
    val testNumber = 29
    println("Is $testNumber a prime number? ${isPrime(testNumber)}")
}
