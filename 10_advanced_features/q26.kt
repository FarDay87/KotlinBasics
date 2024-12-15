inline fun <T> measureExecutionTime(block: () -> T): Pair<T, Long> {
    val startTime = System.nanoTime()
    val result = block()
    val endTime = System.nanoTime()
    val duration = endTime - startTime
    return result to duration
}

fun main() {
    val (result, time) = measureExecutionTime {
        // Пример кода, время выполнения которого нужно замерить
        Thread.sleep(1000)  // Задержка в 1 секунду
        "Hello, Kotlin"
    }
    println("Result: $result, Time taken: $time nanoseconds")
}
