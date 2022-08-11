val name: String = "Kotlin"
var greeting: String? = null

fun main(args: Array<String>) {
//    //                                                        Hello World
//    println("Hello Kotlin")
//    println(name)
//
//    //                                                        var vs val
//    //  name = "abc"  // Error
//    string = "456"
//    println(string)

//                                                              if else
    if (greeting==null){
        greeting = "Hi"
    }else{
        println("Greeting is not null")
    }

//                                                              String Concatenation
    println("$greeting $name")

}