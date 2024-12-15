class LazyInitializationExample {
    val heavyComputation: String by lazy {
        println("Performing heavy computation...")
        "Result of heavy computation"
    }
}

fun main() {
    val example = LazyInitializationExample()

    // heavyComputation будет вычислен только при первом доступе
    println("Before accessing the heavy computation")
    println(example.heavyComputation) // Выведет: Performing heavy computation... и затем Result of heavy computation
    println(example.heavyComputation) // Снова выведет только: Result of heavy computation
}
