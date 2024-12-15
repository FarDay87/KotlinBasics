fun printStringOrEmpty(input: String?) {
    if (input.isNullOrBlank()) {
        println("Empty")
    } else {
        println(input)
    }
}

fun main() {
    printStringOrEmpty("Hello") // Выведет: Hello
    printStringOrEmpty("") // Выведет: Empty
    printStringOrEmpty(null) // Выведет: Empty
}
