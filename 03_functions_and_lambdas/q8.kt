fun String.isPalindrome(): Boolean {
    val cleaned = this.replace("\\s".toRegex(), "").toLowerCase()
    return cleaned == cleaned.reversed()
}

fun main() {
    val word = "A man a plan a canal Panama"
    println("$word is palindrome: ${word.isPalindrome()}")
}
