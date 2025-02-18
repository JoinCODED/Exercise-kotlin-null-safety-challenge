fun main(){
    var address: String? = null
    var name = address ?: "address not provided"

    println("Address: $name")
    address = "Kuwait City, Sharaq"
    println("Address: $name")


    greetUser(null)
    greetUser("Hussain")


    var total = calculateArea(10, 54)
    println("The size of are is $total")



//    var age: Int = 25
    var age: Int? = null
    println("Age: $age")
}


    fun calculateArea(width: Int, height: Int): Int {
        require(width != null && width > 0)
        require(height != null && height > 0)
        return width * height
    }
    fun greetUser(name: String?){
        val length = name?.length
        if(length == null){
            println("Hello, guest! Welcome to our system.")
        }else{
            println("Welcome $name to our system.")
        }
    }