// Класс для создания тега HTML
class HTML(val content: String) {
    override fun toString() = "<html>$content</html>"
}

// Класс для создания тега Body
class Body(val content: String) {
    override fun toString() = "<body>$content</body>"
}

// Класс для создания тега Paragraph
class Paragraph(val content: String) {
    override fun toString() = "<p>$content</p>"
}

// Функция для создания структуры HTML с использованием DSL
fun html(init: HTML.() -> Unit): HTML {
    val htmlContent = StringBuilder()
    val html = HTML(htmlContent.toString())
    html.init()
    return html
}

// Функция для добавления Body в HTML
fun HTML.body(init: Body.() -> Unit) {
    val bodyContent = StringBuilder()
    val body = Body(bodyContent.toString())
    body.init()
    println(body)
}

// Функция для добавления Paragraph в Body
fun Body.p(content: String) {
    println(Paragraph(content))
}

// Пример использования DSL
fun main() {
    val htmlContent = html {
        body {
            p("Welcome to Kotlin DSL!")
            p("This is a simple example.")
        }
    }
    println(htmlContent)
}
