import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try {
            repeat(10) { i ->
                delay(1000)
                println("Task running: iteration $i")
            }
        } catch (e: CancellationException) {
            println("Task was cancelled")
        }
    }

    delay(3500) // Ждем 3.5 секунды
    println("Cancelling task...")
    job.cancelAndJoin() // Отменить задачу и подождать её завершения
    println("Task has been cancelled")
}
