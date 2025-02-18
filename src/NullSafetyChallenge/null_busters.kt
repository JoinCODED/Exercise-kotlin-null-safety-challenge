package NullSafetyChallenge

val greetUser = { name: String?, address: String? ->
    println("Hello, ${name?.let { it.trim() } ?: "honored guest" }! Welcome to $address")
}


fun calculateArea(width: Int?, height: Int?): Int {
    require(width is Int && height is Int, { "All parameters must be of type Int" })
    require(width >=0 && height >=0, { "Parameters must be positive integers" })
    return width * height
}