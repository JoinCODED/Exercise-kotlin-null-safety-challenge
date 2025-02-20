package NullSafetyChallenge

fun main() {
    val nullableAge: Int? = null
    val length = nullableAge?.toString()?.length
    println("$length")
    val defaultAge = nullableAge ?: 18
    val nonNullableAge: Int = 53
}
