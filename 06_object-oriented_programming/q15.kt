abstract class Shape {
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    println("Circle area: ${circle.area()}") // Выведет: Circle area: 78.53981633974483
    println("Rectangle area: ${rectangle.area()}") // Выведет: Rectangle area: 24.0
}
