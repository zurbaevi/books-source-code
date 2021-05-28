package chapter10

interface Retailer<out T> {
    fun sell(): T
}