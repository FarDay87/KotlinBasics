interface Drawable {
    fun draw()
}

class Circle(val radius: Double) : Drawable {
    override fun draw() {
        println("Drawing a Circle with radius $radius")
    }
}

class Square(val side: Double) : Drawable {
    override fun draw() {
        println("Drawing a Square with side $side")
    }
}

fun main() {
    val circle = Circle(5.0)
    val square = Square(4.0)

    circle.draw() // Выведет: Drawing a Circle with radius 5.0
    square.draw() // Выведет: Drawing a Square with side 4.0
}
