fun getGreeting(): String {
    return "This is a kotlin function"
}

fun sayHello(): Unit {
    println(getGreeting())
}

fun main(args: Array<String>) {
    println(getGreeting())
    sayHello()
}
