package chapter2

interface Expr3
class Num3(val value: Int) : Expr3
class Sum3(val left: Expr3, val right: Expr3) : Expr3

fun eval3(e: Expr3): Int =
    when (e) {
        is Num3 ->
            e.value
        is Sum3 ->
            eval3(e.right) + eval3(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(eval3(Sum3(Num3(1), Num3(2))))
}
