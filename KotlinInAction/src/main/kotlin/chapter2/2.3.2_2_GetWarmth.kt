package chapter2

enum class Color4 {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getWarmth(color: Color4) = when(color) {
    Color4.RED, Color4.ORANGE, Color4.YELLOW -> "warm"
    Color4.GREEN -> "neutral"
    Color4.BLUE, Color4.INDIGO, Color4.VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(Color4.ORANGE))
}
