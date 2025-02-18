
fun main(){

    //part2
    greetUser("Dalal")
    greetUser(null)

    //part3
    var address: String? = null
    val defaultAddress = address ?: "Street 8, Al-Quraain"
    println("Address: $defaultAddress")

    //part4
    calculateArea(3, 6)

    //part5
    var age: Int? = 26 // Int is non null type value...adding ? making it nulllable value
    println("Age: $age")
    age = null
    println("Age: $age")

    //bonus

    //1.
    var name: String? = "Dalal"
    name?.let {
        println("The length of your name is ${it.length}.")
    }
    name = null
    name?.let {
        println("This will not be executed because name is null.")
    }
    //2.
    var name2: String? = "Moudhi"
    println("Name length: ${name2!!.length}")

    //name2 = null
    //println("Name length: ${name2!!.length}")  will throw a NullPointerException:

    //3.
    greet("Dalal")
    greet(null)



}

//part 2
fun greetUser(name: String?){

    val nameLength = name?.length
    println("Hello, ${name ?: "Guest"}! Your name has ${nameLength ?: 0} characters.")

}

//part4
fun calculateArea(width: Int, height: Int) {
    // Use require to ensure that width and height are greater than 0
    require(width > 0) { "Width must be greater than 0" }
    require(height > 0) { "Height must be greater than 0" }

    val area = width * height
    println("Area: $area")
}

//bonus 3.
fun greet(name: String?) {
    val greeting = "Hello, ${name ?: "Guest"}!"
    println(greeting)
}






