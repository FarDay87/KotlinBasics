fun checkEvenOdd(number: Int) {
    when {
        number % 2 == 0 -> println("$number is Even")
        else -> println("$number is Odd")
    }
}

fun main() {
    val number = 4
    checkEvenOdd(number)
}
