fun greetUser( name : String? ){
//  println( name.length ) pt2
    if ( name != null ) {
        println( "Hello ${ name.length } !" )
    }else{
        name?:""    //empty string
    }
}

//Step 4
fun calculateArea( width : Int? , height : Int? ) {
    require(width != null, { "width lazyMessage" })
    assert(height != null, { "height lazyMessage"})

    println( width * height!! )
}

fun main(){
    greetUser("Hello World!" )

    //Step 3
    val address: String? = null
    address?: "221B Baker Street, London"

    calculateArea(4,5)
    calculateArea( null, null )

//    var age:Int = null       //Kotlin: Null cannot be a value of a non-null type 'kotlin.Int'.

    //5.2: Kotlin does not allow variables to be assigned null by default
    //      null-able variables require null-checking and can't get accessed directly

}