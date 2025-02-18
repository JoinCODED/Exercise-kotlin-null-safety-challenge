import kotlin.time.times

// Step 2: Facing the Null Menace
fun greetUser(name: String?) {
    // println("Length of the name is: ${name.length}")
    // accesing len of name if it's not nul
    // val nameLength = name?.length
    // println("Name length is: $nameLength")

    val nameLength = name?.length ?: "Please enter a valid name"
    println(nameLength)

}

// Step 4: The Power of Assertions
// I changed Int to Int? to pass the value and excute the code within the function and not getting error before passing it
fun calculateArea(width: Int?, height: Int?) {
    require(width != null,{"Enter a valid number"})
    //another option
    //requireNotNull(width){"Enter a valid number"}
    assert(height != null,{"Enter a valid number"})

    val Area = width * height!!
    println("Area is: $Area")
//    return width * height!!
}

fun main(){

    // Step 2: Facing the Null Menace
    greetUser("yes")
    greetUser(null)

    // Step 3: Unleashing the Elvis Operator
    var address: String? = null
    println(address?: "Default address: Kuwait")



    // Step 4: The Power of Assertions
    var width:Int? = null
    //calculateArea(width = width, height = 4)

    // Step 5: Nullable Types vs. Non-Nullable Types

    var age: Int = 55
    /* age = null cannot assign null to a non-null type
     nonNullable cannot hold a null value
     nullable var can hold a null value
     ? means the variable can hold either a value or null for nullable ones */

    // Bonus Stage: Null Safety Mastery!
    //1. let()
    val name = "Barrak"
    val name2 = null
    name?.let {
        println("Hi $name")
    }
    name2?.let { // this one won't print since name2 is null
        println("Hi $name2")
    }

    //2. !!




}