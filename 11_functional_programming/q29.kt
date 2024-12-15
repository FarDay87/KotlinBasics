fun extractWords(sentences: List<String>): List<String> {
    return sentences.flatMap { it.split(" ") }
}

fun main() {
    val sentences = listOf("Kotlin is great", "Functional programming rocks", "FlatMap is useful")
    val words = extractWords(sentences)
    println(words) // Выведет: [Kotlin, is, great, Functional, programming, rocks, FlatMap, is, useful]
}
