import com.bignerdranch.nyethack.Player

fun main(args: Array<String>) {
    val player = Player()
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


