class Box<T>(private var item: T?) {
    fun addItem(item: T) {
        this.item = item
    }

    fun getItem(): T? {
        return item
    }
}

fun main() {
    val intBox = Box<Int>(null)
    intBox.addItem(42)
    println(intBox.getItem()) // Выведет: 42

    val stringBox = Box<String>("Hello")
    println(stringBox.getItem()) // Выведет: Hello
}
