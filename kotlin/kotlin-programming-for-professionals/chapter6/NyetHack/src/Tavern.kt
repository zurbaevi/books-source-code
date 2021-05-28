fun main(args: Array<String>) {
    var beverage = readLine()
    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - beverage was null!")
    }
    val beverageServed: String = beverage ?: "Buttered Ale"
    println(beverageServed)
}