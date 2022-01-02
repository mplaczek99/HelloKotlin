fun main() {
    sayHello("Hey", "Kotlin")
    sayHello("Hello", "World")
}

fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")