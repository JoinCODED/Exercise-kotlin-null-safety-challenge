import NullSafetyChallenge.*

fun main() {
// commented out to avoid issues running
//    val age: Int = null
    val address: String? = null

    greetUser("Dude!", address ?: "NBK")
    println("Area of 2x6: ${calculateArea(2, 6)}")

}