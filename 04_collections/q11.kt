fun getStringLengths(strings: List<String>): List<Int> {
    return strings.map { it.length }
}

fun main() {
    val strings = listOf("Kotlin", "is", "awesome")
    val lengths = getStringLengths(strings)
    println("String lengths: $lengths")
}
