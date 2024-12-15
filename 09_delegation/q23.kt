interface Drivable {
    fun drive()
}

class Driver : Drivable {
    override fun drive() {
        println("Driver is driving the car.")
    }
}

class Car(driver: Drivable) : Drivable by driver

fun main() {
    val driver = Driver()
    val car = Car(driver)

    car.drive() // Выведет: Driver is driving the car.
}
