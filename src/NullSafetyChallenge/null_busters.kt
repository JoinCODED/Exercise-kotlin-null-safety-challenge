package NullSafetyChallenge

fun greetUser(name: String?, address: String?) {
    val introType = if ((name?.length ?: 0) > 0) name
    else "honored guest!"

    println("Hello, $introType! Welcome to $address")
}


fun calculateArea(width: Int?, height: Int?): Int {
    require(width is Int && height is Int, { "All parameters must be of type Int" })
    require(width >=0 && height >=0, { "Parameters must of positive integers" })
    return width * height
}