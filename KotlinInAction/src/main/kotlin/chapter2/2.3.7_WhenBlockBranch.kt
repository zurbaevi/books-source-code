package chapter2

interface Expr4
class Num4(val value: Int) : Expr4
class Sum4(val left: Expr4, val right: Expr4) : Expr4

fun evalWithLogging(e: Expr4): Int =
    when (e) {
        is Num4 -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum4 -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(evalWithLogging(Sum4(Sum4(Num4(1), Num4(2)), Num4(4))))
}
