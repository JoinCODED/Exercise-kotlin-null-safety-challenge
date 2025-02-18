package NullSafetyChallenge

fun greetUser(name: String?){
    var greetLength = name?.length
    if(null == greetLength){
        println("")

    }
    else{
        println(greetLength)
    }
}

