import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible

// Создаем аннотацию
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Serializable

// Класс с аннотированными свойствами
data class Person(
    @Serializable val name: String,
    @Serializable val age: Int,
    val address: String // Это свойство не будет аннотировано
)

// Функция для получения свойств с аннотацией @Serializable
fun getSerializableProperties(obj: Any) {
    val kClass = obj::class
    // Перебираем все свойства класса
    kClass.memberProperties.forEach { property ->
        // Проверяем, имеет ли свойство аннотацию @Serializable
        if (property.annotations.any { it is Serializable }) {
            property.isAccessible = true // Делаем свойство доступным для чтения
            println("${property.name} = ${property.get(obj)}")
        }
    }
}

// Пример использования
fun main() {
    val person = Person("John", 30, "1234 Elm St")
    getSerializableProperties(person)
}
