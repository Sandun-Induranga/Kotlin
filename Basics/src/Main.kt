//fun getGreeting(): String {
//    return "This is a kotlin function"
//}

fun getGreeting(): String = "Hello Kotlin"

fun sayHello(): Unit {
    println(getGreeting())
}

fun main(args: Array<String>) {
    println(getGreeting())
    sayHello()
}
