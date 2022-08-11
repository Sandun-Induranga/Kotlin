//fun getGreeting(): String {
//    return "This is a kotlin function"
//}

//fun getGreeting(): String = "Hello Kotlin"
//
//fun sayHello(): Unit {
//    println(getGreeting())
//}

//fun sayHello(nameToGreet: String) {
//    val msg = "Hello " + nameToGreet
//    println(msg)
//}

fun sayHello(nameToGreet: String, time:String) = println("Hello $nameToGreet $time")

fun main(args: Array<String>) {
//    println(getGreeting())
    sayHello("Kotlin","Good morning")
}
