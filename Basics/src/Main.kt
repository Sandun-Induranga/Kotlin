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
//    if (greeting==null){
//        greeting = "Hi"
//    }else{
//        println("Greeting is not null")
//    }
//
////                                                            String Concatenation
//    println("$greeting $name")

//                                                              when
//    This is same to java switch case

//    when (name){
//        "Kotlin" -> println("This is kotlin")
//        "Java" -> println("This is java")
//        else -> println("This is null")  // Act as default keyword in java
//    }

    // The below part's process is equals to java ternary operator

    val statement = if (greeting == null) "Hi" else greeting
    println(statement)

    val variable = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
    println(greeting)

}