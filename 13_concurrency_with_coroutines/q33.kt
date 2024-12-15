import kotlinx.coroutines.*

suspend fun fetchFirstData(): String {
    delay(1000)  // Имитация задержки
    return "First result"
}

suspend fun fetchSecondData(): String {
    delay(1500)  // Имитация задержки
    return "Second result"
}

suspend fun fetchThirdData(): String {
    delay(2000)  // Имитация задержки
    return "Third result"
}

// Функция для выполнения нескольких корутин одновременно и сбора результатов
suspend fun fetchDataConcurrently(): List<String> = coroutineScope {
    val deferredFirst = async { fetchFirstData() }
    val deferredSecond = async { fetchSecondData() }
    val deferredThird = async { fetchThirdData() }

    // Собираем результаты, как только они будут готовы
    listOf(deferredFirst.await(), deferredSecond.await(), deferredThird.await())
}

// Пример использования
fun main() = runBlocking {
    val results = fetchDataConcurrently()
    println("Results: $results")
}
