package NullSafetyChallenge

fun main() {

    // Part 2
    greetUser("Humoud")
    greetUser(null)

    println("-----")

    // Part 3
    var address: String? = null
    println(address ?: "Kuwait City, Block x, Street x, Building x")
    address = "Rawda, Block x, Street x, House x"
    println(address)

    println("-----")

    // Part 4
    println(calculateArea(2,5))


    // Part 5
    // var age: Int = null
    // cannot be a value of a non-null type Int

    // Difference between nullable and non-nullable types is that assigning null to a non-nullable will cause a compilation error (NullPointerException)
    // Adding ? as a suffix to a data type such as String? allows it to be null
    // ? is often used in safe calls such as name?.length to check if name isn't null or empty then give me its length
    // Using ? in an Elvis call such as name?.length ?: 0 to assign a default value if the condition isn't satisfied.

    println("-----")

    // Bonus Part 1 and 2
    // let() is one of 5 scope functions that allows the execution of a code block within an object
    // an example of it would be executing it within a lambda expression meaning you can access the object without its name
    // let allows referring to the variable using it within a lambda function, lambda functions are more commonly used in mapping lists or iterating list

    val name = "Humoud"
    name.let {
        println("${name.length}")
    }

    // !! is a Not-null assertion operator is applied to a variable whose value is not null meaning if a variable is null !! forces it to be treated as non-nullable which causes (NullPointerException) when not handled correctly

//    val name: String? = null
//    println(name!!.length) // causes java.lang.NullPointerException

}

// Part 2
fun greetUser(name: String?) {
    println("Your name has ${name?.length ?: 0} characters.")
//    println("Hello, ${name.length}!")
// Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    println("Hello, ${name ?: "traveler!"}")
}

// Part 4
fun calculateArea(width: Int, height: Int): Int {
    require(width > 0 && height > 0)
    return width * height
}