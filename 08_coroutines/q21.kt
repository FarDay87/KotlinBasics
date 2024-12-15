import kotlinx.coroutines.*

fun main() = runBlocking {
    // Запуск трех параллельных задач
    launch {
        delay(1000)
        println("Task 1 completed")
    }

    launch {
        delay(2000)
        println("Task 2 completed")
    }

    launch {
        delay(1500)
        println("Task 3 completed")
    }

    // Ожидание завершения всех задач
    delay(3000) 
}
