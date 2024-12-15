fun <T> printList(list: List<T>) {
    for (item in list) {
        println(item)
    }
}

fun main() {
    val intList = listOf(1, 2, 3, 4)
    val stringList = listOf("Apple", "Banana", "Cherry")

    printList(intList) // Выведет: 1 2 3 4
    printList(stringList) // Выведет: Apple Banana Cherry
}
