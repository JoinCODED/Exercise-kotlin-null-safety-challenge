fun main() {

    var address:String? = null
    println(address?:"defaultAddress");


    try {
        println(calculateArea(5, 3))
        println(calculateArea(-5, 3))
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }




}

fun calculateArea(width: Int, height: Int): Int {
    require(width >= 0) { "Width must be non-negative" }
    require(height >= 0) { "Height must be non-negative" }

    return width * height
}