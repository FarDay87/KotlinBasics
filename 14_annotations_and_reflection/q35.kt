import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible

// Функция для вывода всех свойств объекта и их значений
fun printProperties(obj: Any) {
    val kClass = obj::class
    // Перебираем все свойства класса
    kClass.memberProperties.forEach { property ->
        property.isAccessible = true // Делаем свойство доступным для чтения
        println("${property.name} = ${property.get(obj)}")
    }
}

// Пример использования
fun main() {
    val person = Person("John", 30, "1234 Elm St")
    printProperties(person)
}
