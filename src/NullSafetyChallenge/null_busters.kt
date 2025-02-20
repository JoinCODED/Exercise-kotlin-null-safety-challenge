package NullSafetyChallenge

fun greetUser(name: String?) {
    val length = name?.length
    val greeting = if (name != null) {
        "Hello $name! Your name is $length characters long."
    } else {
        "Hello stranger"
    }
    println(greeting)
}

fun calculateArea(width: Int?, height: Int?) {
    require(width != null && width > 0)
    require(height != null && height > 0)

    val area = width * height
    println("Area: $area")
}

fun main() {
    greetUser("Njood")
    greetUser(null)

    val address: String? = null
    val defaultAddress = address ?: "21"
    calculateArea(5, 10)
}