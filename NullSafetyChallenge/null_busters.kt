var address: String? = null ?: ""

fun greetUser(name: String?){
    println(name?.length ?: 0)
}

fun calculateArea(width: Int?, height: Int?): Int{
    require((width != null && height != null)){
        "Please pass non-null integers"
    }
    return (width ?: 0) * (height ?: 0)
}

fun main(){
    println(calculateArea(4,4))
    var age: Int = null
    // Kotlin: Null cannot be a value of a non-null type 'kotlin.Int'.
    // Nullable types can be assigned a null value but non-nullable types cannot
}