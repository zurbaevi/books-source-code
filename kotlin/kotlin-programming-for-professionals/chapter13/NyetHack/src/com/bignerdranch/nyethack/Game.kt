package com.bignerdranch.nyethack

fun main(args: Array<String>) {
    val player = Player("Madrigal")
    player.castFireball()
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor (Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}


