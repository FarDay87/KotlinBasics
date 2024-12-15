import kotlinx.coroutines.*
import kotlin.random.Random

// Симуляция функции для получения данных (может завершиться с ошибкой)
suspend fun fetchData(): String {
    delay(1000)  // Имитируем задержку, как при запросе данных
    if (Random.nextBoolean()) {
        throw Exception("Network Error")  // Иногда генерируем ошибку
    }
    return "Data fetched successfully"
}

// Функция для попыток загрузить данные с повтором в случае ошибки
suspend fun fetchDataWithRetry(): String {
    var attempt = 0
    while (attempt < 3) {
        try {
            return fetchData()  // Пытаемся получить данные
        } catch (e: Exception) {
            attempt++
            if (attempt == 3) {
                throw e  // Если попытки закончились, выбрасываем исключение
            }
            println("Attempt $attempt failed. Retrying...")
            delay(1000)  // Задержка перед повторной попыткой
        }
    }
    throw Exception("All attempts failed")
}

// Пример использования
fun main() = runBlocking {
    try {
        val result = fetchDataWithRetry()
        println(result)
    } catch (e: Exception) {
        println("Failed to fetch data: ${e.message}")
    }
}
