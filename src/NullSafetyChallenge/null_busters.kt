package NullSafetyChallenge
fun main() {




//2.

    var name:String? ="Abdulwahab"
    greetUser(name)


    name = null
    greetUser(name)

//3.

    val address: String? = null
    println(address?:"Kuwait")

//4.

    calculateArea(10,10)


//5.
    var age:Int? = null


//if i dont add a null operator i get an error stating Kotlin: Null cannot be a value of a non-null type 'kotlin.Int'.
//so to avoid this i made sure that i add ? to tell compiler that it can be nullable




}

fun greetUser(name: String?){

    println(name?.length?:"Hello User!")


}
fun calculateArea(width: Int?, height: Int?) {
    require(width != null && height != null) {
        "width and height must not be null"
    }
    println(width * height)
}


//1. Write a function named greetUser(name: String?) that takes an optional name as input.
//2. Try directly accessing the length of name within the function. Observe the compiler error.
//3. Use a safe call operator `?.` to access the length of name only if it's not null.
//4. Handle the null case gracefully by providing a default greeting if name is null.