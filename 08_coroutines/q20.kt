import kotlinx.coroutines.*

suspend fun fetchApiResponse1(): String {
    delay(1000) // имитация задержки для запроса
    return "Response from API 1"
}

suspend fun fetchApiResponse2(): String {
    delay(1000) // имитация задержки для запроса
    return "Response from API 2"
}

fun main() = runBlocking {
    // Параллельный запуск двух задач
    val response1 = async { fetchApiResponse1() }
    val response2 = async { fetchApiResponse2() }

    // Ожидание завершения задач и комбинирование результатов
    val combinedResponse = "${response1.await()} & ${response2.await()}"
    println(combinedResponse) // Выведет: Response from API 1 & Response from API 2
}
