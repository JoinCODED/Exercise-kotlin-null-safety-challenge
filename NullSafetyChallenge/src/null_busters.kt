
fun greetUser(name: String?): String {

  //name.length
  var nameChecker = name?.length ?: "Human Not Found"
  return "Greetings $nameChecker"

}

fun calculateArea(width: Int?, height: Int?): Int{

  require(width != null) { "Width must not be null" }
  require(height != null) { "Height must not be null" }
  require(width > 0) { "Width must be positive" }
  require(height > 0) { "Height must be positive" }

  return width * height

}


fun main() {

  var address: String? = null
  address ?: "Earth"

  println(calculateArea(5, 10))
  //println(calculateArea(null, 10)) // it will return an error because the value is null
  //println(calculateArea(5, null))
  //println(calculateArea(-5, 10)) // it will return an error because the value is less than 0


  // var age: Int = null  // WRONG Compile-time error: Null cannot be a value of a non-null type Int

  var age: Int? = null  // CORRECT  Allowed: 'age' is declared as nullable using '?'

  println(age)  // Prints: null

  /*
     Explanation:
     - The first line (commented out) tries to assign `null` to a non-nullable `Int`, which is not allowed in Kotlin.
     - The second line correctly declares `age` as a nullable `Int` (`Int?`), so it can hold `null`.
     - The `println(age)` statement prints `null` since `age` has no assigned value.
  */


}
