fun applyDiscount(price: Double, discount: (Double) -> Double): Double {
    return discount(price)
}

fun main() {
    val price = 100.0
    val discount = { price: Double -> price * 0.9 }  // 10% скидка
    println("Price after discount: ${applyDiscount(price, discount)}")
}
