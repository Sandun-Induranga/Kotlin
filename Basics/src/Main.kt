fun main() {

    //                                                                  Array
    val programmingLanguages = arrayOf("Java","Python","Kotlin","C++")
    println(programmingLanguages.size)
    println(programmingLanguages[0])
    println(programmingLanguages.get(0))

    //                                                              Array iteration
    for (programmingLanguage in programmingLanguages) {
        println(programmingLanguage)
    }
}
