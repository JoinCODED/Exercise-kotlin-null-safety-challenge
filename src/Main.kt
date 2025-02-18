import NullSafetyChallenge.greetUser

fun calculateArea(width: Int?, height: Int?): Int{
    require(width != null && width > 0)
    require(height != null && height > 0)

    return width * height
}

fun main() {
    greetUser(null)
    var address: String? = null
    var addressLength = address?.length ?: 0
    println(addressLength)
    println(calculateArea(7,8))
    var age: Int = 25
//    age = null
    println(age)
}