fun greet(name: String?) {
    val nameInput = name ?: "Guest"
    val greeting = if (nameInput == "Guest") {
        "Hello, Guest!"
    } else {
        "Hello, $nameInput, your name is ${nameInput.length} characters long"
    }
    println(greeting)
}


fun calculateArea(width: Int?, height: Int?): Int {
    require(width != null) { "Width cannot be null" }
    require(height != null) { "Height cannot be null" }
    return width * height
}

fun main() {
    greet("Sarah")
    greet(null)

    var address: String? = null
    println(address?: "No address provided")


    println("Area: ${calculateArea(5, 10)}")
    //println("Area: ${calculateArea(5, null)}")
// will cause an error


    //val age: Int = null

   /*
   val age: Int = 28
    val nullAge: Int? = null
    println("Age: $age")
    println("Nullable Age: $nullAge")
*/
/*
Declaring age: Int and assigning it null causes an error.
Non-nullable Int Cannot hold null values,but a nullable Int?: Can hold null values and used with safe calls
*/
    // Bonus

    val name: String? = "Sarah"
    name?.let { //similar to do while, approve exxcution if not null
        println("Hello, $it")
    }

    val length = name!!.length
    println("Name length: $length")

    val defaultName: String? = null
    greet(defaultName ?: "Guest") //passing null to greet
}
