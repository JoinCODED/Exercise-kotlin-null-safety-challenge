package NullSafetyChallenge

fun greetUser(name:String?):Int{
    return name?.length?:0
}