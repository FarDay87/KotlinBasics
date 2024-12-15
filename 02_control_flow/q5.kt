fun fibonacci(n: Int): List<Int> {
    val fibList = mutableListOf(0, 1)
    for (i in 2 until n) {
        fibList.add(fibList[i - 1] + fibList[i - 2])
    }
    return fibList
}

fun main() {
    val fibonacciSequence = fibonacci(10)
    println("First 10 Fibonacci numbers: $fibonacciSequence")
}
