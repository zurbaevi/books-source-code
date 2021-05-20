package chapter1

fun main(args: Array<String>) {
    val persons = listOf(
        Person("Alice"),
        Person("Bob", age = 29)
    )

    val oldest = persons.maxBy { it.age ?: 0 }
    println("The oldest is: $oldest")
}