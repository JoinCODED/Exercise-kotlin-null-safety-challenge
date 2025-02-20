
fun greetUser(name: String?) {

    val nameLength = name?.length
    println("Name length: $nameLength")

    if (name == null) {
        println("Hello, guest!")
    } else {
        println("Hello, $name! Your name has ${name.length} characters.")
    }
}
    fun calculateArea(width: Int, height: Int): Int {
        require(width > 0) { "Width must be greater than zero" }
        require(height > 0) { "Height must be greater than zero" }

        return width * height
    }


fun main() {
    greetUser("Misk")
    greetUser(null)

    val address: String? = null
    val userAddress = address ?: "Unknown Address"
    println("User address: $userAddress")


    try {
        val area1 = calculateArea(5, 10)
        println("Area 1: $area1")

        val area2 = calculateArea(-5, 10)
        println("Area 2: $area2")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
    val age:Int = 24
    val ageNullable: Int? = null
    println(ageNullable?.toString() ?: "Age is unknown")


}

