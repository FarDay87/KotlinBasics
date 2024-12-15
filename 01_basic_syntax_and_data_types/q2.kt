fun getStringLength(input: String?): Int {
    return input?.length ?: -1
}

fun main() {
    val nullableString: String? = null
    println("Length of nullableString: ${getStringLength(nullableString)}")

    val nonNullableString: String? = "Kotlin"
    println("Length of nonNullableString: ${getStringLength(nonNullableString)}")
}
