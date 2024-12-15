data class Book(val title: String, val author: String, val price: Double)

fun main() {
    val books = listOf(
        Book("Book 1", "Author A", 15.0),
        Book("Book 2", "Author B", 25.0),
        Book("Book 3", "Author C", 10.0),
        Book("Book 4", "Author D", 30.0)
    )

    val cheapBooks = books.filter { it.price < 20.0 }
    println(cheapBooks) // Выведет: [Book(title=Book 1, author=Author A, price=15.0), Book(title=Book 3, author=Author C, price=10.0)]
}
